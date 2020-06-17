package ru.emamontov.tradingService.services;

import ru.emamontov.tradingService.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findById(Long id);

    void createUser(User newUser);

    void deleteUser(Long id);
}
