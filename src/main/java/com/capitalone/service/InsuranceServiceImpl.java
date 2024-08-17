package com.capitalone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.model.Insurance;
import com.capitalone.repository.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService{

	
	@Autowired
	public InsuranceRepository inspRepo;
	
	public InsuranceServiceImpl() {
		super();
	}

	public InsuranceServiceImpl(InsuranceRepository inspRepo) {
		super();
		this.inspRepo = inspRepo;
	}

	@Override
	public Insurance createInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Insurance getInsurance(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Insurance updateInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInsurance(String name) {
		// TODO Auto-generated method stub
		
	}

}
