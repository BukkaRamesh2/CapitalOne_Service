package com.capitalone.exception;

public class InvalidCreditException extends RuntimeException{
	public InvalidCreditException(String message) {
		super(message);
	}

}
