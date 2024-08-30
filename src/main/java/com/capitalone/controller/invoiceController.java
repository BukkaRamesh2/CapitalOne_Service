package com.capitalone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capitalone.model.Invoice;
import com.capitalone.service.InvoiceServiceImpl;

@RestController
public class invoiceController {
	
	@Autowired
	private InvoiceServiceImpl invimpl;
	
	@PostMapping("/createInvoice")
	private Invoice CreateInvoice( @RequestBody Invoice inv) {
		return invimpl.createInvoice(inv);
	}
	
	@GetMapping("/allInvoice")
	private List<Invoice> allInvoice(){
		List<Invoice> invList = invimpl.allInvoice();
		return invList;
	}
	
	@DeleteMapping("/{InvoiceNumber}")
	private void deleteInvoice(@PathVariable Long InvoiceNumber) {
		invimpl.deleteInvoice(InvoiceNumber);
	}

}
