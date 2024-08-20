package com.capitalone.service;

/**
 * Author : Nikhil
 */


import com.capitalone.model.Services;

public interface ServicesService {

	public Services createLoan(Services service);

	public Services getLoan(String name);

	public Services updateLoan(Services service);

	public void deleteLoan(String name);

	public Services createDeposit(Services service);

	public Services getDeposit(String name);

	public Services updateDeposit(Services service);

	public void deleteDeposit(String name);


}