package com.douzone.smartchecker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class MainController {
	
	
	@ResponseBody
	@RequestMapping(value="/login")
	public String login() {
		
		return "abc";
	}

}
