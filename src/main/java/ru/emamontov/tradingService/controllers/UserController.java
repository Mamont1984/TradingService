package ru.emamontov.tradingService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.emamontov.tradingService.entities.User;
import ru.emamontov.tradingService.repositories.UserReposiory;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserReposiory userReposiory;

    @GetMapping
    public List<User> findAllUsers(){
        List<User> list = new ArrayList<>();
        userReposiory.findAll().forEach(e -> list.add(e));
        return list;
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id){
        return userReposiory.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User newUser){
        userReposiory.save(newUser);
        return newUser;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userReposiory.deleteById(id);
    }
}
