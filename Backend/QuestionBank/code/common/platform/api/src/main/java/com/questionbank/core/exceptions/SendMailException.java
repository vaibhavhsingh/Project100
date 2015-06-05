package com.questionbank.core.exceptions;

public class SendMailException extends Exception{

	private static final long serialVersionUID = -153785360910978932L;

	public SendMailException() {
		super();
	}

	public SendMailException(String message, Throwable cause) {
		super(message, cause);
	}

	public SendMailException(String message) {
		super(message);
	}

	public SendMailException(Throwable cause) {
		super(cause);
	}
}
