package com.capitalone.service;

import com.capitalone.model.Account;

public interface AccountService {

    // Method to create a new Account
    Account createAccount(Account account);

    // Method to create an Account with a name
    Account createAccount(Account account, String name);

    // Method to retrieve an Account by name
    Account getAccountByName(String name);

    // Method to update an existing Account
    Account updateAccount(Account account);

    // Method to delete an Account by name
    void deleteAccountByName(String name);
}
