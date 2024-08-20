/**
 * 
 */
package com.capitalone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * ramesh b
 */
@Entity
@Table(name = "Customer")
public class Customer{
	
	// accessspecifier datatype name
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;  // 12   "12"
	private String name;
	private String address;
	private Integer phoneNumber;
	private String email;
	private boolean status;
	private double balance;
	
	private Account account;  // aggregation 
	
	/*
	 *   access specifiers
	 *   
	 *   private  -- the scope exists only in the class
	 *   public  -- the scope exists entire applications
	 *   protected -- the scope is to access only inside packages
	 *   default -- is same as public
	 *   
	 *   
	 *   data types 
	 *     int -- stores integers
	 *     float  -- decimal values -- up to 2 decimals
	 *     double  -- decimal values with more memeory to store 
	 *     string  -- combination of characters
	 *     long  -- intergers with more memory 
	 *     boolean  -- true/false  0/1
	 *     character  -- single
	 *  
	 *   Wrapper classes can be used to type case
	 *    INTEGER 
	 *    Long -- type case 
	 *    
	 *     
	 *   Constructors
	 *   
	 *     -- class name
	 *     -- n numbner of constructors with smae class name
	 *     
	 *     
	 *   Control sattment and deciosn making statments
	 *   
	 *   do 
	 *   while
	 *   
	 *    for loop
	 *    for each loop
	 *    
	 *    if(){
	 *    
	 *    }else{
	 *    
	 *    } 
	 *    
	 *    if(){
	 *    if(){
	 *    }else 
	 *    }
	 * 
	 */

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Long customerId, Account acc) {
		// TODO Auto-generated constructor stub
		this.customerId = customerId;
		this.account = acc;
	}
	
	public Customer(Long customerId, String name, String address, int phoneNumber, String email, boolean status,
			double balance) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.status = status;
		this.balance = balance;
	}

	public Long getCustomerId(){
		return customerId;
	}
	
    public void setCustomerId(Long customerId){
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
    
  
	

}
