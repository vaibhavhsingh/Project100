package com.questionbank.security.exceptions;

public class UserNotFoundException extends Exception{

	private static final long serialVersionUID = 7046759604249407457L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String string) {
		super(string);
	}
	
	public UserNotFoundException(Throwable t) {
		super(t);
	}
	
	public UserNotFoundException(String string, Throwable t) {
		super(string,t);
	}
}
