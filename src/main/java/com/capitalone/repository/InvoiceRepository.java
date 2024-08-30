package com.capitalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capitalone.model.Invoice;
import com.capitalone.model.Services;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
