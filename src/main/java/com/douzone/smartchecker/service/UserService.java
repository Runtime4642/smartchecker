package com.douzone.smartchecker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douzone.smartchecker.repository.UserDao;
import com.douzone.smartchecker.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	
	public UserVo login(String id,String password) {
		UserVo authuser =userDao.get(id,password);
			return authuser;
	}

	

}
