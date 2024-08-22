package com.capitalone.service;

import com.capitalone.model.Insurance;


public interface InsuranceService {

	
	public Insurance createInsurance(Insurance insurance);
	
	public Insurance getInsurance(String name);

	public Insurance updateInsurance(Insurance insurance);
	
	public void deleteInsurance(String name);
	
}