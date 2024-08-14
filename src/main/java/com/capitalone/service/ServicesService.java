package com.capitalone.service;

/**
 * Author : Nikhil
 */


import com.capitalone.model.Services;

public interface ServicesService {
	
	Services createLoan(Services service);

	Services getLoan(String name);

	Services updateLoan(Services service);

	void deleteLoan(String name);

	Services createDeposit(Services service);

	Services getDeposit(String name);

	Services updateDeposit(Services service);

	void deleteDeposit(String name);

	
}
