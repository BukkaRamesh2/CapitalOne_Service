package com.capitalone.service;

import java.util.List;

/**
 * Author : Nikhil
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.exception.InvalidCreditException;
import com.capitalone.exception.LoanNotFoundException;
import com.capitalone.model.Services;

import com.capitalone.repository.ServicesRepository;

@Service
public class ServicesServiceImpl implements ServicesService {
	
	
	@Autowired
	public ServicesRepository servRepo;
	
	public ServicesServiceImpl() {
		
	}

	@Override
	public Services createLoan(Services service) {
		// TODO Auto-generated method stub
		
		// check if loan already exists in records
		if (servRepo.existsById(service.getLoanId())) {
			throw new IllegalArgumentException("Loan already exists in our data");
		}	
		
		//check if credit score is greater than 700 to approve loan or approve if loan type is house loan even if the credit score is low
		else if(service.getCreditScore() < 700) {
			if(service.getLoanType().equals("House Loan")) {
				return  servRepo.save(service);
			}
			
			throw new InvalidCreditException("Credit Score is lower than the required value");			
		}
		
		else {
			System.out.println("System exited");
		}
		
		return servRepo.save(service);
	}

	@Override
	public Services getLoan(String serviceName) {
		// TODO Auto-generated method stub
		
		List<Services> getServList = servRepo.findAll();
		
		for (Services service : getServList) {
			System.out.println(service);
		}
		
		return servRepo.findByServiceName(serviceName);
	}
	
	
	

	@Override
	public Services updateLoan(Services service, Long loanId) {
		// TODO Auto-generated method stub
		
		// check if the loan amount is more than the maximum amount
		try {
		switch(service.getLoanType()) {
		case "House Loan":
			if(service.getLoanAmount() > 800000 ) {
				throw new IllegalArgumentException("Loan Amount is more than the maximum value");			
			}
			break;
		
		case "Car Loan":
			if(service.getLoanAmount() > 100000 ) {
				throw new IllegalArgumentException("Loan Amount is more than the maximum value");			
			}
			break;
		
		case "Education Loan":
			if(service.getLoanAmount() > 50000 ) {
				throw new IllegalArgumentException("Loan Amount is more than the maximum value");			
			}
			break;
		
		default:
			throw new IllegalArgumentException("This Loan type does not exist");			
		
		}
		} catch(Exception e) {
			throw new LoanNotFoundException("Loan Id" + loanId + "does not exist");	}
	
		
		return servRepo.save(service);
	}

	@Override
	public void deleteLoan(String serviceName) {
		// TODO Auto-generated method stub
		servRepo.deleteByServiceName(serviceName);
		
	}

	
	
}


	