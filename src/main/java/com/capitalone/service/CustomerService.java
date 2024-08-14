package com.capitalone.service;

import com.capitalone.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Customer getCustomer(String name);

	Customer updateCustomer(Customer customer);

	void deleteCustomer(String name);

}
