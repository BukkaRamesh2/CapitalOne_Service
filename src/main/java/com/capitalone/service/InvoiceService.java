package com.capitalone.service;

import java.util.List;

import com.capitalone.model.Invoice;

public interface InvoiceService {
	
	Invoice createInvoice(Invoice invoice);
	Invoice editInvoice(Long InvoiceNumber, Invoice invoice);
	Invoice getInvoicebyId(Long InvoiceNumber);
	 void deleteInvoice(Long InvoiceNumber);
	 List<Invoice> allInvoice();

}
