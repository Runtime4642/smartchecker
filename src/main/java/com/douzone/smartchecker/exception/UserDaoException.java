package com.douzone.smartchecker.exception;

public class UserDaoException extends RuntimeException {
	
	private static final long serialVersion = 1;
	
	
	public UserDaoException(String message) {
		super(message);
	}
	public UserDaoException() {
		super("userDao 예외");
	}

}
