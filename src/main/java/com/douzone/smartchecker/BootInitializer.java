package com.douzone.smartchecker;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.filter.HiddenHttpMethodFilter;


//jenkin로 올리려면 이게 있어야함.. 좀더 알아보자 jar 를 war로
@EnableAutoConfiguration
public class BootInitializer extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BootApplication.class);
	}
	
	
	//spring boot 에서 PUT/PATCH/DELETE 사용하기 위함.
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		registerHiddenFieldFilter(servletContext);
	}
	
	private void registerHiddenFieldFilter(ServletContext aContext) {
	        aContext.addFilter("hiddenHttpMethodFilter", new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null ,true, "/*"); 
	 }
	

}	
