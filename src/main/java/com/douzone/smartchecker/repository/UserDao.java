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
	
	public UserVo get(String email,String password)
	{

		Map<String,String> map = new HashMap<>();
		map.put("email", email);
		map.put("password", password);
		UserVo userVo=sqlSession.selectOne("user.getByEmailAndPassword",map);
		return userVo;
	}
	
	
	public UserVo get(String email) {
		
		return sqlSession.selectOne("user.getByEmail",email);
	
	}
	public boolean update(UserVo vo)
	{
		return sqlSession.update("user.update",vo)==1;
	}
	
	public int insert(UserVo vo) {
		int count = sqlSession.insert("user.insert",vo);
		return count;

	}
	
	
}