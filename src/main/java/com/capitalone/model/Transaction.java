
package com.capitalone.model;

/**
 * 
 * 
 * Author: Mani
 */
public class Transaction {


    private Long transactionId;  
    private Long customerId;      
    private double amount;      
    private String date;          
    private String type;          
    private String description;   

   
    public Transaction() {
        // TODO Auto-generated constructor stub
    }


    public Transaction(Long transactionId) {
        this.transactionId = transactionId;
    }


    public Transaction(Long transactionId, Long customerId, double amount, String date, String type, String description) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.description = description;
    }

    // Getters and Setters

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
