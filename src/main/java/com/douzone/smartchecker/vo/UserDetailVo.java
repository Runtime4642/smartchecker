package com.douzone.smartchecker.vo;

import java.util.Collection;

import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.userdetails.User;

public class UserDetailVo extends User {
	   private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

	    // 유저의 정보를 더 추가하고 싶다면 이곳과, 아래의 생성자 파라미터를 조절해야 한다.
	  
	    private String name;

	    public UserDetailVo(String id, String password ,String name
	            , boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked
	            , Collection authorities
	            ) {
	        super(id, password
	                , enabled, accountNonExpired, credentialsNonExpired, accountNonLocked
	                , authorities);
	      
	        this.name=name;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
	    
	    



}
