package com.capitalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capitalone.model.Insurance;
import com.capitalone.service.InsuranceService;

@RestController
public class InsuranceController {

	public InsuranceController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public InsuranceService insuranceService;

	@PostMapping("/saveIns")
	public Insurance createInsurance(@RequestBody Insurance insurance) {
		return insuranceService.createInsurance(insurance);
	}

	@PutMapping("/updateIns")
	public Insurance updateInsurance(@RequestBody Insurance insurance) {
		return insuranceService.updateInsurance(insurance);
	}

	@DeleteMapping("/deleteIns")
	public void deleteInsurance(@PathVariable String name) {
		insuranceService.deleteInsurance(name);
	}


	@GetMapping("/getIns/{name}")
	public Insurance getInsurance(@PathVariable String name) {
		return insuranceService.getInsurance(name);
	}




}