package com.capitalone.exception;

public class BankingException extends RuntimeException {
	public BankingException(String message) {
		super(message);
	}
}
