package com.capitalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capitalone.model.Transaction;
import com.capitalone.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    //Create transaction
    @PostMapping("/create")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    // View transaction details
    @GetMapping("/{transactionId}")
    public Transaction getTransaction(@PathVariable Long transactionId) {
        return transactionService.getTransaction(transactionId);
    }


    //Transfer money to another account
    @PostMapping("/transfer")
    public String transferFunds(@RequestBody Transaction transaction) {
        return transactionService.transferFunds(transaction);
    }

    //Deposit
    @PostMapping("/deposit")
    public String depositFunds(@RequestBody Transaction transaction) {
        return transactionService.depositFunds(transaction);
    }

    //Withdraw
    @PostMapping("/withdraw")
    public String withdrawFunds(@RequestBody Transaction transaction) {
        return transactionService.withdrawFunds(transaction);
    }

    //Cancel Transaction
    @PutMapping("/{transactionId}/cancel")
    public String cancelTransaction(@PathVariable Long transactionId) {
        return transactionService.cancelTransaction(transactionId);
    }

    // Transaction History
    @GetMapping("/account/{accountId}/history")
    public List<Transaction> getTransactionHistory(@PathVariable Long accountId) {
        return transactionService.getTransactionHistory(accountId);
    }

    //Transaction Status Check
    @GetMapping("/{transactionId}/status")
    public String getTransactionStatus(@PathVariable Long transactionId) {
        return transactionService.getTransactionStatus(transactionId);
    }
    //Flag suspicious trnsactions
    @PostMapping("/account/{accountId}/flag-suspicious")
    public String flagSuspiciousTransactions(@PathVariable Long accountId) {
        return transactionService.flagSuspiciousTransactions(accountId);
    }
}
