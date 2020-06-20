package ru.emamontov.tradingService.services;

import ru.emamontov.tradingService.entities.Account;

import java.util.List;

public interface AccountService {
    Account findById(Long id);

    List<Account> findAllAccounts();

    Account createAccount(Account account);
    
    void deleteAccount(Long accountId);
}
