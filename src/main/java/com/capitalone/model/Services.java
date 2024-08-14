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
	
	private String depositName;
	private double depositAmount;
	private String depositAccount;
	
	public Services() {
		
		
	}
	
	
	
	public Services(Long customerId, Long loanId, String loanType, double loanAmount, float interestRate,
			String depositName, double depositAmount, String depositAccount) {
		super();
		this.customerId = customerId;
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.depositName = depositName;
		this.depositAmount = depositAmount;
		this.depositAccount = depositAccount;
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
	public String getDepositName() {
		return depositName;
	}
	public void setDepositName(String depositName) {
		this.depositName = depositName;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getDepositAccount() {
		return depositAccount;
	}
	public void setDepositAccount(String depositAccount) {
		this.depositAccount = depositAccount;
	}
	
	
}
