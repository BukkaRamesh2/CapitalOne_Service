package com.capitalone.util;

import com.capitalone.model.Account;
import com.capitalone.model.Customer;
import com.capitalone.model.Services;

public class Test {
	
	
	
	/*
	 *   General info on captial one 
	 *   
	 *   
	 *   
	 *   Customers  -- ramesh
	 *   Transactions -- mani
	 *   Services  -- nikhil
	 *   Accounts -- abhi
	 *   Card -- prasanna 
	 *   Insurance -- sreedath
	 *   Branch -- Srinadh
	 *   Employee -- Deepa
	 *   Client -- Hari
	 *   
	 *   
	 *   
	 *    
	 *   
	 *   
	 *   ****
	 *   
	 *   Model / pojo  -- objects associatyed to attributes and methods
	 *   Controller   -- Receive the request from browser and pass to service to perform business logic
	 *   Service  -- preocess all the business logic and send the final object to repository
	 *   Repository  -- save the data to database and get the data based on customer queries
	 *   Exceptions  -- global exceptions used t0 have a good definations for errors to understand by customers
	 *   Util -- general classes 
	 *   
	 *   
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccType("savings");
		account.setBal(100.00f);
		account.setName("accName");
		
		Customer c = new Customer(123L, account);
		
		
		c.getAccount().getBal();
		
		Services ac = new Services();
		//ac.get
		//
		//ac.get
		
		
	
	}

}
