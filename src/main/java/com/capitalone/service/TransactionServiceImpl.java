package com.capitalone.service;

import com.capitalone.exception.InsufficientFundsException;
import com.capitalone.exception.TransactionNotFoundException;
import com.capitalone.model.Transaction;
import com.capitalone.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {


    @Autowired
    private TransactionRepository transactionRepository;
    private List<Transaction> arrayList = new ArrayList<>();
    private List<Transaction> linkedList = new LinkedList<>();

    private Set<Long> hashSet = new HashSet<>();
    private Set<Long> linkedHashSet = new LinkedHashSet<>();
    private Map<Long, Transaction> hashMap = new HashMap<>();
    private Map<Long, Transaction> synchronizedHashMap = Collections.synchronizedMap(new HashMap<>());
    private Map<Long, Transaction> hashtable = new Hashtable<>();

    private Map<Long, Transaction> linkedHashMap = new LinkedHashMap<>();


    @Override
    public Transaction createTransaction(Transaction transaction) {
        try {
            long startTime, endTime;

            // ArrayList insertion time:  542 ns
            startTime = System.nanoTime();
            arrayList.add(transaction);
            endTime = System.nanoTime();
            System.out.println("ArrayList insertion time: " + (endTime - startTime) + " ns");

            // LinkedList insertion time:  2834 ns
            startTime = System.nanoTime();
            linkedList.add(transaction);
            endTime = System.nanoTime();
            System.out.println("LinkedList insertion time: " + (endTime - startTime) + " ns");

            // HashSet insertion time: 1292 ns
            startTime = System.nanoTime();
            hashSet.add(transaction.getTransactionId());
            endTime = System.nanoTime();
            System.out.println("HashSet insertion time: " + (endTime - startTime) + " ns");

            // LinkedHashSet insertion time: 916 ns
            startTime = System.nanoTime();
            linkedHashSet.add(transaction.getTransactionId());
            endTime = System.nanoTime();
            System.out.println("LinkedHashSet insertion time: " + (endTime - startTime) + " ns");


            // LinkedHashMap insertion time: 666 ns
            startTime = System.nanoTime();
            linkedHashMap.put(transaction.getTransactionId(), transaction);
            endTime = System.nanoTime();
            System.out.println("LinkedHashMap insertion time: " + (endTime - startTime) + " ns");

            // HashMap insertion time: 375 ns
            startTime = System.nanoTime();
            hashMap.put(transaction.getTransactionId(), transaction);
            endTime = System.nanoTime();
            System.out.println("HashMap insertion time: " + (endTime - startTime) + " ns");


            // Synchronized HashMap insertion time: 2000 ns
            startTime = System.nanoTime();
            synchronizedHashMap.put(transaction.getTransactionId(), transaction);
            endTime = System.nanoTime();
            System.out.println("Synchronized HashMap insertion time: " + (endTime - startTime) + " ns");

            // Hashtable insertion time
//            startTime = System.nanoTime();
//            hashtable.put(transaction.getTransactionId(), transaction);
//            endTime = System.nanoTime();
//            System.out.println("Hashtable insertion time: " + (endTime - startTime) + " ns");


            return transactionRepository.save(transaction);

        } catch (Exception e) {
            throw new RuntimeException("Error creating transaction: " + e.getMessage(), e);
        }
    }

    @Override
    public Transaction getTransaction(Long transactionId) {


        long startTime, endTime;

        // ArrayList retrieval time: 1623375 ns
        startTime = System.nanoTime();
        Transaction transaction = null;
        for (Transaction trans : arrayList) {
            if (trans.getTransactionId().equals(transactionId)) {
                transaction = trans;
                break;
            }
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList retrieval time: " + (endTime - startTime) + " ns");

        // HashMap retrieval time: 13333 ns
        startTime = System.nanoTime();
        transaction = hashMap.get(transactionId);
        endTime = System.nanoTime();
        System.out.println("HashMap retrieval time: " + (endTime - startTime) + " ns");


        return transactionRepository.findById(transactionId)
            .orElseThrow(() -> new TransactionNotFoundException("Transaction with ID " + transactionId + " not found"));
    }

    @Override
    public List<Transaction> getTransactionsForAccount(Long accountId) {
        try {
            return transactionRepository.findAllByAccountId(accountId);
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving transactions for account: " + e.getMessage(), e);
        }
    }

    @Override
    public String transferFunds(Transaction transaction) {

        double accountBalance = getAccountBalance(transaction.getAccountId());

        //check for sufficient funds
        if (accountBalance < transaction.getAmount()) {
            return "Transfer failed: Insufficient funds";
        }
        //deduct funds and mark transfer as successful
        try {
            // Deduct funds and mark transfer as successful
            deductFunds(transaction.getSourceAccountId(), transaction.getAmount());
            addFunds(transaction.getDestinationAccountId(), transaction.getAmount());
            transactionRepository.save(transaction);
            return "Transfer successful";
        } catch (Exception e) {
            throw new RuntimeException("Error processing transfer: " + e.getMessage(), e);
        }
    }

    @Override
    public String depositFunds(Transaction transaction) {
        //adding funds to the destination account
        try {
            // Adding funds to the destination account
            addFunds(transaction.getDestinationAccountId(), transaction.getAmount());
            transaction.setStatus("Completed");
            transactionRepository.save(transaction);
            return "Deposit successful";
        } catch (Exception e) {
            throw new RuntimeException("Error processing deposit: " + e.getMessage(), e);
        }
    }

    @Override
    public String withdrawFunds(Transaction transaction) {
        // Check if the account has sufficient balance
        double accountBalance = getAccountBalance(transaction.getSourceAccountId());

        if (accountBalance < transaction.getAmount()) {
           throw new InsufficientFundsException("Withdrawal failed: Insufficient funds");
        }

        // Deduct funds from the account
        try {
            // Deduct funds from the account
            deductFunds(transaction.getSourceAccountId(), transaction.getAmount());
            transaction.setStatus("Completed");
            transactionRepository.save(transaction);
            return "Withdrawal successful";
        } catch (Exception e) {
            throw new RuntimeException("Error processing withdrawal: " + e.getMessage(), e);
        }
    }
    

    @Override
    public String cancelTransaction(Long transactionId) {

     //canceling a transaction
        
     if (transactionRepository.existsById(transactionId)) {
        Transaction transaction = transactionRepository.findById(transactionId).orElse(null);
     // Check if transaction exists
     if (transaction != null) {
     //check if the transaction is already completed
     if (transaction.getStatus().equalsIgnoreCase("Completed")) {
         return "Cancellation failed: Transaction already completed";
     }

     // Process cancellation
     transaction.setStatus("Canceled");
     transactionRepository.save(transaction);
     return "Transaction canceled successfully";
 }}
 
    return "Cancellation failed: Transaction not found";
 
}

    @Override
    public List<Transaction> getTransactionHistory(Long accountId) {
        try {
            return transactionRepository.findAllByAccountId(accountId);
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving transaction history: " + e.getMessage(), e);
        }
    }

    @Override
    public String getTransactionStatus(Long transactionId) {
        try {
            Transaction transaction = getTransaction(transactionId);
            return "Status: " + transaction.getStatus();
        } catch (TransactionNotFoundException e) {
            return "Transaction not found";
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving transaction status: " + e.getMessage(), e);
        }
    }

    @Override
    public String flagSuspiciousTransactions(Long accountId) {
        //get all transactions
        List<Transaction> transactions = transactionRepository.findAllByAccountId(accountId);
        //set threshold value
        double suspiciousThreshold = 10000.0;  
        int flaggedCount = 0;

        //check for suspicious transactions
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() > suspiciousThreshold) {
                transaction.setStatus("Suspicious");
                transactionRepository.save(transaction);
                flaggedCount++;
            }
        }

        return flaggedCount + " suspicious transactions flagged";
    }

    private double getAccountBalance(Long accountId) {
         // Dummy balance
        return 1000.00;
    }
    private void deductFunds(Long accountId, double amount) {
        //deducting funds from the account
        System.out.println("Deducting " + amount + " from account " + accountId);
    }

    private void addFunds(Long accountId, double amount) {
        //adding funds to the account
        System.out.println("Adding " + amount + " to account " + accountId);
    }
}