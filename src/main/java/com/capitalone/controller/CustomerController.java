package com.capitalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capitalone.model.Customer;
import com.capitalone.service.CustomerService;




@RestController
@RequestMapping("customer")
public class CustomerController {

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
	/*  asdasd
	 * Create customer
	 * get customer
	 * Update customer
	 * Delete customer
	 * 
	 *  @RestController  -- rest operation and get data in JSON or XML formats
	 *  @RequestMapping  -- 
	 *  @RequestBody  -- 
	 *  
	 *  @Service  -- implmentaooion class 
	 *  @Repository
	 *  @Entity
	 * 
	 * 
	 */
	@Autowired
	public CustomerService customerService;
	
	@PostMapping("/saveCust")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/getCust/{name}")
	public Customer getCustomer(@PathVariable String name) {
		return customerService.getCustomer(name);
	}
	
	@PutMapping("/updateCust")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/deleteCust/{name}")
	public void deleteCustomer(@PathVariable(value="name") String name) {
		customerService.deleteCustomer(name);
	}
	
	

}
