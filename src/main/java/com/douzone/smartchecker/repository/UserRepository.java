package com.douzone.smartchecker.repository;

import org.springframework.data.repository.CrudRepository;

import com.douzone.smartchecker.vo.UserVo;

public interface UserRepository extends CrudRepository< UserVo, String>{
  
  public UserVo findByUsername(String username); 
}