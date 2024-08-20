package com.capitalone.exception;

public class CustomerNotFoundException extends BankingException {
	public CustomerNotFoundException(Long customerId) {
		super("Customer with ID " + customerId + " not found.");
	}
}
