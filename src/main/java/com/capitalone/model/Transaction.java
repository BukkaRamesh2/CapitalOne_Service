
package com.capitalone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Test Git
 * 
 * Author: Mani
 */
@Entity
@Table(name = "Transaction")
public class Transaction{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;  
	
    private Long customerId;      
    private Long accountId;
    private Long sourceAccountId;
    private Long destinationAccountId;
    private double amount;      
    private String date;          
    private String type;          
    private String description;   
    private String status;

   
    public Transaction() {
        // TODO Auto-generated constructor stub
    }


    public Transaction(Long transactionId) {
        this.transactionId = transactionId;
    }


    public Transaction(Long transactionId, Long customerId, double amount, String date, String type, String description, String status) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.description = description;
        this.status =status;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    // Getter and Setter for sourceAccountID
    public Long getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(Long sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    // Getter and Setter for destinationAccountID
    public Long getDestinationAccountId() {
        return destinationAccountId;
    }

    public void setDestinationAccountId(Long destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }
}