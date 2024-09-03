package com.capitalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capitalone.model.Account;
import com.capitalone.service.AccountService;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    // Create account
    @PostMapping("/saveAccount")
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    // Get account by name
    @GetMapping("/getAccount/{name}")
    public Account getAccountByName(@PathVariable String name) {
        return accountService.getAccountByName(name);
    }

    // Update account
    @PutMapping("/updateAccount")
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    // Delete account by name
    @DeleteMapping("/deleteAccount/{name}")
    public void deleteAccountByName(@PathVariable String name) {
        accountService.deleteAccountByName(name);
    }
}
