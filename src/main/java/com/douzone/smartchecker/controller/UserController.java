package com.douzone.smartchecker.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.security.Auth;
import com.douzone.security.AuthUser;
import com.douzone.smartchecker.service.UserService;
import com.douzone.smartchecker.vo.UserVo;

@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginForm() {
		
		return "user/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login() {
		
		return "user/login";
	}
	

	
	
}
