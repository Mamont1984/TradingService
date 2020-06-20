package ru.emamontov.tradingService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.emamontov.tradingService.entities.Account;
import ru.emamontov.tradingService.entities.User;
import ru.emamontov.tradingService.services.UserService;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public User findUserById(@PathVariable Long userId){
        return userService.findById(userId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User newUser){
        userService.createUser(newUser);
        return newUser;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
    }

    @GetMapping("/{userId}/accounts/")
    public List<Account> findAllUserAccounts(@PathVariable Long userId){
        return userService.findAllUserAccounts(userId);
    }
}
