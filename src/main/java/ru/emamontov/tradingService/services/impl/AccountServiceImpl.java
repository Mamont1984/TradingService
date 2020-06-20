package ru.emamontov.tradingService.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.emamontov.tradingService.entities.Account;
import ru.emamontov.tradingService.repositories.AccountRepository;
import ru.emamontov.tradingService.services.AccountService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public List<Account> findAllAccounts() {
        List<Account> list = new ArrayList<>();
        accountRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}
