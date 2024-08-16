package com.capitalone.service;

import com.capitalone.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);
	
	Customer createCustomer(Customer customer, String name);

	Customer getCustomer(String name);

	Customer updateCustomer(Customer customer);

	void deleteCustomer(String name);

}
