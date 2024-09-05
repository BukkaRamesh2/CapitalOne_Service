package com.capitalone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.model.Account;
import com.capitalone.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account createAccount(Account account, String name) {
        account.setName(name);
        return accountRepository.save(account);
    }

    @Override
    public Account getAccountByName(String name) {
        return accountRepository.findByName(name);
    }

    @Override
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccountByName(String name) {
        accountRepository.deleteByName(name);
    }
}

