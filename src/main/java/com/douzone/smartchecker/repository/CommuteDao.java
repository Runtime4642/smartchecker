package com.douzone.smartchecker.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.dto.CalendarDto;

@Repository
public class CommuteDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	public List<CalendarDto> selectByMonth(int Month){
		return sqlSession.selectList("commute.getByMonth", Month);
	}

}
