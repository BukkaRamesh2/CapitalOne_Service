package com.capitalone.service;

/**
 * Author : Nikhil
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return servRepo.save(service);
	}

	@Override
	public Services getLoan(String name) {
		// TODO Auto-generated method stub
		return servRepo.findByName(name);
	}

	@Override
	public Services updateLoan(Services service) {
		// TODO Auto-generated method stub
		return servRepo.save(service);
	}

	@Override
	public void deleteLoan(String name) {
		// TODO Auto-generated method stub
		servRepo.deleteByName(name);
		
	}

	@Override
	public Services createDeposit(Services service) {
		// TODO Auto-generated method stub
		return servRepo.save(service);
	}

	@Override
	public Services getDeposit(String name) {
		// TODO Auto-generated method stub
		return servRepo.findByName(name);
	}

	@Override
	public Services updateDeposit(Services service) {
		// TODO Auto-generated method stub
		return  servRepo.save(service);
	}

	@Override
	public void deleteDeposit(String name) {
		// TODO Auto-generated method stub
		servRepo.deleteByName(name);
	}
	
}
