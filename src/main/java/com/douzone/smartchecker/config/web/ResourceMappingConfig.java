package com.douzone.smartchecker.config.web;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ResourceMappingConfig implements WebMvcConfigurer{
	//Resource Mapping to URL
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/uploads/images/**").addResourceLocations("file:/uploads/");
		registry.addResourceHandler("/uploads/board/**").addResourceLocations("file:/uploads/");
	
	}

}
