package com.douzone.smartchecker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.douzone.smartchecker.config.web.SecurityConfig;
import com.douzone.smartchecker.config.web.WebSecurityConfig;

@Configuration 
@Import(value= {WebSecurityConfig.class})
public class WebConfig {

	
	
}
