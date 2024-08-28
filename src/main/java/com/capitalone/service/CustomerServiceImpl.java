package com.capitalone.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

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
	
	
	
	//Collections syntax   
	// Java.util 
	private List<Customer> arrayList = new ArrayList<>();
	private List<Customer> linkedList = new LinkedList<>();
	
	private Set<Long> hashSet = new HashSet<>();
	private Set<Long> linkedHashset = new LinkedHashSet<>();
	private Set<Long> treeSet = new TreeSet<>();
	
	private Map<Long, Customer> hashMap = new HashMap<>();   // hashtable
	private Map<Long, Customer> linkedHashMap = new LinkedHashMap<>();
	private Map<Long, Customer> treeMap = new TreeMap<>();


	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		long startTime, endTime;
		// check weather a user exists in DB 
		// I want to caliclutae the time of each object creation i.e., how much time is tyaken by arraylist and how much time is taken by linkedlist 
		
		
		// check iof the email ends with xys dont allow him to register
		
		
		//ArrrayList insertion time
		startTime = System.nanoTime();// starting time 
		arrayList.add(customer); // adding custoemr to arraylist
		endTime = System.nanoTime();  // endTime
		System.out.println("ArrayList insertion time: " + (endTime - startTime));  // the time taken to insert data by arrraylist
		

		//LinkedList insertion time
		startTime = System.nanoTime();// starting time 
		linkedList.add(customer); // adding custoemr to arraylist
		endTime = System.nanoTime();  // endTime
		System.out.println("LinkedList insertion time: " + (endTime - startTime));  // the time taken to insert data by arrraylist
		
		// the dafault capacity arraylist is assigned as 10
		// the linked list will not have default capcaity 
		
		// hashmap is non synchrinosed 
		/*
		 *  HahsMap --> non synchronised
		 *         q	allowing one null key and mupltiple null  values
		 *              hashmap performace is fast 
		 *              we can make hasmap as synchronised by using 
		 *              Collections.synchronizedMap(hahsMap);
		 *  HashTable -- sync
		 *              dont allow any nulls
		 *              performance is slow
		 *              we cant make it unsynchronised
		 *              
		 *   
		 *    multi threading 
		 *   
		 *    Lifecycle of thyread is 
		 *    
		 *    Thread()  -- new 
		 *    Start()  -- runnable
		 *    run()   -- runnning 
		 *    sleep(), wait()  -- waiting 
		 *       -- Dead and termiate the thread.
		 * 
		 * 
		 *   two ways we can declare a thread
		 *   runnable -- implements
		 *   Thread -- extends
		 *   
		 *   
		 */
		
		// Map
		startTime = System.nanoTime();// starting time 
		hashMap.put(customer.getCustomerId(), customer); // adding custoemr to hashMap
		endTime = System.nanoTime();  // endTime
		System.out.println("LinkedList insertion time: " + (endTime - startTime));  // the time taken to insert data by arrraylist
		
		
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
		
		long startTime, endTime;
		Customer customer  = null;
		
		// get data from list
		startTime = System.nanoTime();// starting time 
		for(Customer cust : arrayList) {
			if(cust.getName().equals(name)) {
				customer = cust;
				break;
			}
		}
		endTime = System.nanoTime();  // endTime
		System.out.println("arrayList retrival time: " + (endTime - startTime));  // the time taken to retrive data by arrraylist
		
		
		//get data using Map interface
		startTime = System.nanoTime();// starting time 
		customer = hashMap.get(name);
		endTime = System.nanoTime();  // endTime
		for (Map.Entry<Long, Customer> entry : hashMap.entrySet()) {  // internally the data is stored in hash table format of data 
			Long key = entry.getKey();
			Customer val = entry.getValue();
			
		}
		System.out.println("Map retrival time: " + (endTime - startTime));  // the time taken to insert data by arrraylist
		
		

		

		
		List<Customer> getCustList = custRepo.findAll();    // { "john" , "alex", "roger"} 1000
		int a= 5;
		// loops 
		for(int i =0; i < getCustList.size(); i++) {
			System.out.println(i);  // i refers to each customer
		}
		
		
		// for each loop
		for (Customer customer1 : getCustList ) {
			System.out.println(customer1);  // each individual customer
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
		 *   List -- ARRAYLIST, LINKEDLIST
		 *   SET  -- HASHSET, LINKEDHASHSET, TREESET
		 *   MAP  -- HASHMAP, LINKEDHASH, TREEMAP
		 * 
		 *   ARRAYLIST -- {"a", "b", "c"}; -- 0
		 *    
		 *   Map -- Key Value format of data 
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
