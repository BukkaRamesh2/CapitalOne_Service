package com.capitalone.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.exception.BankingException;
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
		
		// check weather a user exists in DB 
		
		// check iof the email ends with xys dont allow him to register
		
		
		if (custRepo.existsById(customer.getCustomerId())) {

			if (customer.getEmail().endsWith("@yahoo.com")) {
				throw new IllegalArgumentException("Invalid email domain ");
			}
			throw new BankingException("Customer with Id: " + customer.getCustomerId() + " already exists in our records ");
			
		} else if (customer.getAddress().equalsIgnoreCase("Texas")) {
			return custRepo.save(customer);
		} else {
           System.out.println("System exited ");
		}

		return custRepo.save(customer);
		
		
		
	}

	@Override
	public Customer getCustomer(String name) {
		// TODO Auto-generated method stub
		
		List<Customer> getCustList = custRepo.findAll();    // { "john" , "alex", "roger"} 1000
		int a= 5;
		// loops 
		for(int i =0; i < getCustList.size(); i++) {
			System.out.println(i);  // i refers to each customer
		}
		
		
		// for each loop
		for (Customer customer : getCustList ) {
			System.out.println(customer);  // each individual customer
			//sendNotification()
		}
		
		while(a<5) {
			// process my busieness logic 
		}
		
		return custRepo.findByName(name);
	}

	@Override
	public Customer updateCustomer(Customer customer){
		
		/*
		 * 
		 *  compile time exception // checked 
		 *  Run time exceptions // unchecked 
		 * 
		 *  try block -- buisiness logic wih 
		 *  catch block
		 *  
		 *  multiple catch blocks 
		 *  
		 *  throw
		 *  throws -- followed by method signiture 
		 *  
		 *  finally 
		 * 
		 * 
		 * 
		 */
		
		
		File file = new File("C://test");
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		String a = "John";   // compile time 
		
		int x = 0;
		int b = 100/x;  // Run time exceoption 
		
		
		try {
		// swich statment take a decison making based on your address
		switch(customer.getAddress().toLowerCase()) {
		case "texas":
			 if(customer.getPhoneNumber() > 10) {
				 throw new IllegalArgumentException("the number is greate than 10");
			 }
			 break;
		case "virgina":
			 if(customer.getPhoneNumber() > 10) {
				 throw new IllegalArgumentException("the number is greate than 10");
			 }
			 break;
		case "arkansas":
			 if(customer.getPhoneNumber() > 10) {
				 throw new IllegalArgumentException("the number is greate than 10");
			 }
			 break;
		case "new mexico":
			 if(customer.getPhoneNumber() > 10) {
				 throw new IllegalArgumentException("the number is greate than 10");
			 }
			 break;
		case "oklahama":
			 if(customer.getPhoneNumber() > 10) {
				 throw new IllegalArgumentException("the number is greate than 10");
			 }
			 break;
		 default:
			 throw new IllegalArgumentException("The input is out of united states");
		}
		}catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
		return custRepo.save(customer);
	}

	@Override
	public void deleteCustomer(String name) {
		custRepo.deleteByName(name);
		
	}

	@Override
	public Customer createCustomer(Customer customer, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
