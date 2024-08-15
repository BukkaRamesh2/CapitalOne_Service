package com.capitalone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.model.Customer;
import com.capitalone.repository.CustomerRepository;

/*
 *  Implements  -- use the connection betwn ur class to interface
 *  
 *  Extends  -- connection between class to class 
 * 
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerRepository custRepo;

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return custRepo.save(customer);
	}

	@Override
	public Customer getCustomer(String name) {
		// TODO Auto-generated method stub
		return custRepo.findByName(name);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return custRepo.save(customer);
	}

	@Override
	public void deleteCustomer(String name) {
		custRepo.deleteByName(name);
		
	}

}
