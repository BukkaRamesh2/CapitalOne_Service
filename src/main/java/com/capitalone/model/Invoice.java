package com.capitalone.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Invoice {
	
	@Id
	private Long invoiceNumber;
	private Date invoiceDate;
	private Double totalAmount;
	private Long AccountNumber;
	private Long transactionID;

	public Invoice(Long invoiceNumber, Date invoiceDate, Double totalAmount, Long accountNumber, Long transactionID) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.invoiceDate = invoiceDate;
		this.totalAmount = totalAmount;
		AccountNumber = accountNumber;
		this.transactionID = transactionID;
	}
	
	

	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", invoiceDate=" + invoiceDate + ", totalAmount="
				+ totalAmount + ", AccountNumber=" + AccountNumber + ", transactionID=" + transactionID
				+ ", toString()=" + super.toString() + "]";
	}



	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(Long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}
	public Long getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(Long transactionID) {
		this.transactionID = transactionID;
	}

	
	

}
