 package com.Dipta.SubscriptionCleaner.controller;

import com.Dipta.SubscriptionCleaner.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Dipta.SubscriptionCleaner.services.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class Controller {

    @Autowired
    private UserService userService;
    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllusers();
    }
    @PostMapping("/register")
    public User registerUser(@RequestBody User u){
        return userService.saveUser(u.getEmail(),u.getPassword(),u.getName());
    }
    @GetMapping("/email/{email}")
    public Optional<User> getUserBymail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }
    @GetMapping("/id/{ID}")
    public Optional<User> getUserByID(@PathVariable long ID){
        return userService.getUserById(ID);
    }

}
