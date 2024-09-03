package com.capitalone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

/**
 * Sreedath
 * testing...
 */



@Entity
@Table(name = "Insurance")
public class Insurance {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)// i think this line isnt required, because its making all insuranceIds 1,2,3,4..
	private Long insuranceId;
	private String policyType;
	private Integer policyNumber;
	private Integer policySpanInYears;
	private Integer coverageAmount;
	private Integer premiumAmount;
	private String beneficiary;
	
	
	public Insurance( Long insuranceId, String policyType, Integer policyNumber,
			Integer policySpanInYears, Integer coverageAmount, Integer premiumAmount, String beneficiary) {
		super();
	
		this.insuranceId = insuranceId;
		this.policyType = policyType;
		this.policyNumber = policyNumber;
		this.policySpanInYears = policySpanInYears;
		this.coverageAmount = coverageAmount;
		this.premiumAmount = premiumAmount;
		this.beneficiary = beneficiary;
	}

	public Insurance(Long insuranceId) {
		super();
		this.insuranceId = insuranceId;
	}


	public Insurance() {
	}

	
	
	
	public Long getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(Long insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Integer getPolicySpanInYears() {
		return policySpanInYears;
	}
	public void setPolicySpanInYears(Integer policySpanInYears) {
		this.policySpanInYears = policySpanInYears;
	}
	public Integer getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(Integer coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	public Integer getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(Integer premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public String getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

}