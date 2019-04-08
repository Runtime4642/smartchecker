package com.douzone.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//클래스 위와 매소드가능하게
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {
	
	public enum Role{ ADMIN,USER};
	Role value() default Role.USER;
	/*test*/
	//String value() default "USER";
	//int method() default 1;
	
}
