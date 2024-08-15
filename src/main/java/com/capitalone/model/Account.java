package com.capitalone.model;
/**
 * Account = Abhi
 */
public class Account {
	
	private Long customerId;
	private String name;
	private String accType;
	private float bal;
	private boolean creditCard;
	private float ccBal;
	private int creditScore;
	
	public Account() {
		
	}
	public Account(Long CustomerId) {
		this.customerId = customerId;
		
	}
	
	
	public Account(Long customerId, String name, String accType, float bal, boolean creditCard, float ccBal,
			int creditScore) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.accType = accType;
		this.bal = bal;
		this.creditCard = creditCard;
		this.ccBal = ccBal;
		this.creditScore = creditScore;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId){
		this.customerId = customerId;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	public boolean isCreditCard() {
		return creditCard;
	}
	public void setCreditCard(boolean creditCard) {
		this.creditCard = creditCard;
	}
	public float getCcBal() {
		return ccBal;
	}
	public void setCcBal(float ccBal) {
		this.ccBal = ccBal;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	
	
}
