package com.capitalone.exception;

public class LoanNotFoundException extends RuntimeException{
	public LoanNotFoundException(String message) {
		super(message);
	}
}
