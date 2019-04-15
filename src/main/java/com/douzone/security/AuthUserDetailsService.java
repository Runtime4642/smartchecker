package com.douzone.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.douzone.smartchecker.repository.UserRepository;
import com.douzone.smartchecker.vo.UserDetailVo;
import com.douzone.smartchecker.vo.UserVo;

@Repository
public class AuthUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository user;
    private org.springframework.security.core.userdetails.User userdetails;
    
    
    private UserDetailVo userDeatilVo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        UserVo user = getUserDetail(username);
        if (user != null) {
        	int num=0;
            if(user.getRole().equals("ADMIN"))
             num = 1;
            else
             num=2;
            userDeatilVo = new UserDetailVo(user.getUsername(),
                    user.getPassword(),
                    user.getName(),
                    enabled,
                    accountNonExpired,
                    credentialsNonExpired,
                    accountNonLocked,
                    getAuthorities(num)
            );
            return userDeatilVo;
        } else {
        	userDeatilVo = new UserDetailVo("empty",
                    "empty",
                    "empty",
                    false,
                    true,
                    true,
                    false,
                    getAuthorities(1)
            );
            return userDeatilVo;
        }
    }

    public List<GrantedAuthority> getAuthorities(Integer role) {

        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
        if (role == 1) {
            authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else if (role == 2) {
            authList.add(new SimpleGrantedAuthority("ROLE_USER"));
        }

        return authList;
    }

    private UserVo getUserDetail(String username) {

        UserVo userVo = user.findByUsername(username);
        if (userVo == null) {
            System.out.println("user '" + username + "' on nulli!");
        } else {
            System.out.println(userVo.toString());
        }

        return userVo;
    }
}
