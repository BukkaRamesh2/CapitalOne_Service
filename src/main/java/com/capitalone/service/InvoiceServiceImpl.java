package com.capitalone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.model.Invoice;
import com.capitalone.repository.InvoiceRepository;

import java.util.List;
import java.util.function.Function;
import java.util.*;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	@Autowired
	private InvoiceRepository invRepo;

	@Override
	public Invoice createInvoice(Invoice invoice) {
		return invRepo.save(invoice);
	}

	
	@Override
	public Invoice getInvoicebyId(Long num) {
		List<Invoice> invList = invRepo.findAll();
		return invRepo.findById(num).get();
		
	}

	@Override
	public void deleteInvoice(Long InvoiceNumber) {
		// TODO Auto-generated method stub
		 invRepo.deleteById(InvoiceNumber);
	}


	@Override
	public Invoice editInvoice(Long InvoiceNumber, Invoice invoice) {
//		invoice = invRepo.findById(InvoiceNumber)
//				.map(  x -> {
//					x.setAccountNumber(invoice.getAccountNumber());
//					x.setInvoiceNumber(invoice.getInvoiceNumber());
//					x.setInvoiceDate(invoice.getInvoiceDate());
//					x.setTotalAmount(invoice.getTotalAmount());
//					x.setTransactionID(invoice.getTransactionID());
//				});
//		
//		return invRepo.save(invoice);
		return null;
	}


	@Override
	public List<Invoice> allInvoice() {
		List<Invoice> invList = invRepo.findAll();
		return invList;
	}

}
