package com.douzone.smartchecker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.douzone.dto.CalendarDto;
import com.douzone.smartchecker.service.CommuteService;



@RequestMapping("/commute")
@Controller
public class CommuteController {
	
	@Autowired
	private CommuteService commuteService;
	
	@RequestMapping(value="/calendar",method=RequestMethod.GET)
	public void calendar(@RequestParam(value="month",required=false,defaultValue="4") int month) {
		List <CalendarDto> list = commuteService.getCalendarList(month);
		for(CalendarDto dto : list)
			System.out.println(dto);
	}
	
	//나중에 GET - >PUT으로 바꿔야함
	//@Auth(Role.ADMIN)
	@RequestMapping(value="/{no}",method=RequestMethod.GET)
	public void modify(@PathVariable("no") Long no) {
		
		
		
	}
	
	
	
	
	
	

}
