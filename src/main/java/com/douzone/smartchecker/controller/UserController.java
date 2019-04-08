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
	
	//java config 로 하면 defaultservlet으로 빠짐 아마도 매핑되는게 없어서 .. 그걸 방지하기위함. auth 작동시키려고
	@RequestMapping(value="/auth",method=RequestMethod.POST)
	public void auth() {
		
	}

	//java config 로 하면 defaultservlet으로 빠짐 아마도 매핑되는게 없어서 .. 그걸 방지하기위함. auth 작동시키려고
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public void logout() {
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginForm() {
		
		return "user/login";
	}
	
	
	
}
