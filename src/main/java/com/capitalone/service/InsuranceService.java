package com.capitalone.service;

import com.capitalone.model.Insurance;


public interface InsuranceService {

	
	Insurance createInsurance(Insurance insurance);
	
	Insurance getInsurance(String name);

	Insurance updateInsurance(Insurance insurance);
	
	void deleteInsurance(String name);
	
}