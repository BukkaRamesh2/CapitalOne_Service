package com.capitalone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Services")
public class Services {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long serviceId;
	
	private String serviceName;

	private Long loanId;
	private String loanType;
	private double loanAmount;
	private float interestRate;
	private int creditScore;
	

	public Services() {

	}

	public Services( Long loanId, String loanType, double loanAmount, float interestRate, int creditScore) {
		super();
	
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.creditScore = creditScore;
		
	}



	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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

	
	

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

}
