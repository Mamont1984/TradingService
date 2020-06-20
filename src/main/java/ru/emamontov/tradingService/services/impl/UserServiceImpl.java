package ru.emamontov.tradingService.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.emamontov.tradingService.entities.Account;
import ru.emamontov.tradingService.entities.User;
import ru.emamontov.tradingService.repositories.AccountRepository;
import ru.emamontov.tradingService.repositories.UserRepository;
import ru.emamontov.tradingService.services.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private AccountRepository accountRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<User> findAllUsers(){
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void createUser(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<Account> getAllUserAccounts(Long userId) {
        User user = userRepository.findById(userId).get();
        return accountRepository.findByUser(user);
    }
}
