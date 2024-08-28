package com.capitalone.service;

import com.capitalone.model.Insurance;


public interface InsuranceService {

	
	public Insurance createInsurance(Insurance insurance);
	
	public Insurance getInsurance(Long insuranceId);

	public Insurance updateInsurance(Insurance insurance);
	
	public void deleteInsurance(Long insuranceId);
	
}