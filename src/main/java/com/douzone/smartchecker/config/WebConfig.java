package com.douzone.smartchecker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.douzone.smartchecker.config.web.ResourceMappingConfig;
import com.douzone.smartchecker.config.web.SecurityConfig;

@Configuration  //bootapplication 과 같은 패키지 안에 있어서 자동 검색됨
//@EnableWebMvc   //<mvc:anntaion-driven/> 이랑 똑같음.. defaultservlethandler 랑 같음
//@ComponentScan(value= {"com.douzone.mysite.controller","com.douzone.mysite.exception"})
@Import(value= {SecurityConfig.class,ResourceMappingConfig.class})
public class WebConfig {

	
	
}
