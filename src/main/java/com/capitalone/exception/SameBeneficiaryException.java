package com.capitalone.exception;

public class SameBeneficiaryException  extends RuntimeException {
    public SameBeneficiaryException(String message) {
        super(message);
    }
}
