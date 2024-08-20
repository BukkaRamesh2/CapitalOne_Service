
package com.capitalone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

/**
 * 
 * 
 * Author: Mani
 */
@Entity
@Table(name = "Tranaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;  
    
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


    public Transaction(Long transactionId, double amount, String date, String type, String description) {
        this.transactionId = transactionId;
   
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
