package com.questionbank.core.exceptions;

public class ContextNotCreatedException extends Exception {

	private static final long serialVersionUID = 4836423561772912822L;

	public ContextNotCreatedException() {
		super();
	}

	public ContextNotCreatedException(String message) {
		super(message);
	}

	public ContextNotCreatedException(Throwable th) {
		super(th);
	}

	public ContextNotCreatedException(String message, Throwable th) {
		super(message, th);
	}
}
