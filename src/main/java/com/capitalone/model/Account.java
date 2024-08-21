package com.capitalone.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Account = Abhi
 */
@Entity
@Table(name = "Account")
public class Account implements Serializable{
	
	private static final long serialVersionUID = 535169887089801888L;



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;
	
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "accType")
	private String accType;
	
	@Column(name = "bal")
	private float bal;
	
	@Column(name = "creditCard")
	private boolean creditCard;
	
	@Column(name = "ccBal")
	private float ccBal;
	
	@Column(name = "creditScore")
	private int creditScore;
	
	
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
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
