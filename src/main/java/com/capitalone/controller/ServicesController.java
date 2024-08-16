package com.capitalone.controller;

/**
 * Author : Nikhil
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capitalone.model.Services;
import com.capitalone.service.ServicesService;

@RestController 
public class ServicesController {
	
	public ServicesController() {
		
	}
	
	/*
	 * Create loan
	 * get loan
	 * Update loan
	 * Delete loan
	 * 
	 * 
	 * 
	 */
	
	@Autowired
	public ServicesService servicesService;
	
	@PostMapping("/saveLoan")
	public Services createLoan(@RequestBody Services service) {
		return servicesService.createLoan(service);
	}
	
	@GetMapping("/getLoan/{name}")
	public Services getLoan(@PathVariable String name) {
		return servicesService.getLoan(name);
	}
	
	@PutMapping("/updateLoan")
	public Services updateLoan(@RequestBody Services service) {
		return servicesService.updateLoan(service);
	}
	
	@DeleteMapping("/deleteLoan")
	public void deleteLoan(@PathVariable String name) {
		servicesService.deleteLoan(name);
	}
	
	

}
