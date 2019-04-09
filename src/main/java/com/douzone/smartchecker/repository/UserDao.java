package com.douzone.smartchecker.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.smartchecker.vo.UserVo;


@Repository
public class UserDao{
	
	
	@Autowired
	private SqlSession sqlSession;
	
	public UserVo get(String id,String password) {
		Map<String,String> map = new HashMap<>();
		map.put("id", id);
		map.put("password", password);
		return sqlSession.selectOne("user.getByIdAndPassword",map);
	}
	
	
}