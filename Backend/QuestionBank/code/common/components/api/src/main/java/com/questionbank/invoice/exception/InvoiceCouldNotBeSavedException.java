package com.questionbank.invoice.exception;

public class InvoiceCouldNotBeSavedException extends Exception{

	private static final long serialVersionUID = -106127417277006209L;

	public InvoiceCouldNotBeSavedException() {
		super();
	}

	public InvoiceCouldNotBeSavedException(String string) {
		super(string);
	}
	
	public InvoiceCouldNotBeSavedException(Throwable t) {
		super(t);
	}
	
	public InvoiceCouldNotBeSavedException(String string, Throwable t) {
		super(string,t);
	}
}
