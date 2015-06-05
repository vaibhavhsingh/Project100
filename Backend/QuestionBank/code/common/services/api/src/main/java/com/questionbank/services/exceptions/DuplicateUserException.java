package com.questionbank.services.exceptions;

public class DuplicateUserException extends Exception{

	private static final long serialVersionUID = 5729222667925780859L;

	public DuplicateUserException() {
		super();
	}

	public DuplicateUserException(String string) {
		super(string);
	}
	
	public DuplicateUserException(Throwable t) {
		super(t);
	}
	
	public DuplicateUserException(String string, Throwable t) {
		super(string,t);
	}
}
