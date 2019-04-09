package com.douzone.smartchecker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douzone.dto.CalendarDto;
import com.douzone.smartchecker.repository.CommuteDao;

@Service
public class CommuteService {
	
	@Autowired
	private CommuteDao commuteDao;
	
	public List<CalendarDto> getCalendarList(int Month){
		return commuteDao.selectByMonth(Month);
	}
	
	public boolean modifyCommute(int no) {
		return false;
	}

}
