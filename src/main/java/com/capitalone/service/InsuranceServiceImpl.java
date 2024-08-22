package com.capitalone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.exception.BankingException;
import com.capitalone.exception.InvalidInsuranceNameException;
import com.capitalone.exception.SameBeneficiaryException;
import com.capitalone.model.Insurance;
import com.capitalone.repository.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService{

	
	public InsuranceServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public InsuranceRepository inspRepo;
	
	@Override
	public Insurance createInsurance(Insurance insurance) {

		if(inspRepo.existsById(insurance.getInsuranceId())) {
			throw new BankingException("Insurance with id: "+ insurance.getInsuranceId()+ " already exists.");
		}
		
		else if(inspRepo.findByBeneficiary(insurance.getBeneficiary())!=null) {
				throw new SameBeneficiaryException("Another customer already has the beneficiary: " + insurance.getBeneficiary() + " listed on their insurance policy.");
			}
		else
			{System.out.println("Executed");}
		
		
		
		return inspRepo.save(insurance);
	}

	@Override
	public Insurance getInsurance(String name) {
		// TODO Auto-generated method stub
		
		if (name == null || name.trim().isEmpty()) {
		       throw new InvalidInsuranceNameException();
		   }
		else
			return inspRepo.findByName(name);

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