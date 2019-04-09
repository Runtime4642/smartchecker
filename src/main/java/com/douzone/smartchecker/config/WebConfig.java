package com.douzone.smartchecker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.douzone.smartchecker.config.web.SecurityConfig;

@Configuration 
@Import(value= {SecurityConfig.class})
public class WebConfig {

	
	
}
