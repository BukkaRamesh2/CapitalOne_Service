package com.capitalone.model;

/**
 * Author : Nikhil
 */

public class Services {
	private Long customerId;
	private Long loanId;
	private String loanType;
	private double loanAmount;
	private float interestRate;
	private int creditScore;
	
	
	
	public Services() {
		
		
	}
	
	
	
	public Services(Long customerId, Long loanId, String loanType, double loanAmount, float interestRate,
			 int creditScore) {
		super();
		this.customerId = customerId;
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		
		this.creditScore = creditScore;
	}



	public int getCreditScore() {
		return creditScore;
	}



	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}



	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
}
