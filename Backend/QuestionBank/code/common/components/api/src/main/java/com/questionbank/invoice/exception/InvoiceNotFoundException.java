package com.questionbank.invoice.exception;

public class InvoiceNotFoundException extends Exception{

	private static final long serialVersionUID = 6709021616018050785L;

	public InvoiceNotFoundException() {
		super();
	}

	public InvoiceNotFoundException(String string) {
		super(string);
	}
	
	public InvoiceNotFoundException(Throwable t) {
		super(t);
	}
	
	public InvoiceNotFoundException(String string, Throwable t) {
		super(string,t);
	}
}
