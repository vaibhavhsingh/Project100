package com.questionbank.security.exceptions;

public class UserNotRegisteredException extends Exception{

	private static final long serialVersionUID = -6033529106751599717L;

	public UserNotRegisteredException() {
		super();
	}

	public UserNotRegisteredException(String string) {
		super(string);
	}
	
	public UserNotRegisteredException(Throwable t) {
		super(t);
	}
	
	public UserNotRegisteredException(String string, Throwable t) {
		super(string,t);
	}


}
