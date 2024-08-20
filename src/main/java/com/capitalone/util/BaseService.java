package com.capitalone.util;
import java.time.LocalDateTime;

public abstract class BaseService {

    // Static field for tracking the number of operations performed
    private static int operationCount = 0;

    // Static method to increment and return operation count
    public static int incrementOperationCount() {
        return ++operationCount;
    }

    // Method to log operations (Demonstrates Polymorphism if overridden)
    protected void logOperation(String operation) {
        System.out.println(LocalDateTime.now() + ": " + operation);
    }
}