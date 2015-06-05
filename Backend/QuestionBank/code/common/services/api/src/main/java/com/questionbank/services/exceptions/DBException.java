package com.questionbank.services.exceptions;

public class DBException extends Exception {

	private static final long serialVersionUID = 7252890550737762997L;

	public DBException() {
		super();
	}

	public DBException(String message) {
		super(message);
	}

	public DBException(Throwable th) {
		super(th);
	}

	public DBException(String message, Throwable th) {
		super(message, th);
	}

}
