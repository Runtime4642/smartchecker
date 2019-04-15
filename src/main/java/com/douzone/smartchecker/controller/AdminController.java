package com.douzone.smartchecker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.smartchecker.service.UserService;

@RequestMapping("/admin")
@Controller
public class AdminController {

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
	
	@RequestMapping(value="/")
	public String main(Authentication authentication) {
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		System.out.println(userDetails.getUsername());
		System.out.println(userDetails.getPassword());
		
		System.out.println("어드미이인~");
//		UserVo userVo = (UserVo) authentication.getPrincipal();
//		System.out.println(userVo.toString());
		return "user/login";
	}
	

	
	
}
