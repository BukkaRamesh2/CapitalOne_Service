package com.capitalone.exception;

public class InvalidInsuranceNameException extends RuntimeException {
	
    public InvalidInsuranceNameException() {
        super("The provided insurance name is invalid.");
    }
}