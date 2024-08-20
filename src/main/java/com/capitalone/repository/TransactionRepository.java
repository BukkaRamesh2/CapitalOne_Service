package com.capitalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitalone.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
