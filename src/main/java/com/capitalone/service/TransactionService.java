package com.capitalone.service;

import com.capitalone.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Transaction transaction);

    Transaction getTransaction(Long transactionId);

    List<Transaction> getTransactionsForAccount(Long accountId);

    String transferFunds(Transaction transaction);

    String depositFunds(Transaction transaction);

    String withdrawFunds(Transaction transaction);

    String cancelTransaction(Long transactionId);

    List<Transaction> getTransactionHistory(Long accountId);

    String getTransactionStatus(Long transactionId);

    String flagSuspiciousTransactions(Long accountId);
}