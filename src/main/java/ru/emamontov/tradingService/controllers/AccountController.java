package ru.emamontov.tradingService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.emamontov.tradingService.entities.Account;
import ru.emamontov.tradingService.services.AccountService;

import java.util.List;

@RestController
@RequestMapping("api/v1/accounts")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> findAllAccounts(){
        return accountService.findAllAccounts();
    }

    @GetMapping("/{accountId}")
    public Account findAccountById(@PathVariable Long accountId){
        return accountService.findById(accountId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account newAccount){
        return accountService.createAccount(newAccount);
    }
}
