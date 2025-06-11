package com.Dipta.SubscriptionCleaner.services;

import com.Dipta.SubscriptionCleaner.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Dipta.SubscriptionCleaner.repo.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public Optional<User> getUserByEmail(String email){
        return userRepo.findByEmail(email);
    };
    public Optional<User> getUserById(long id){
        return userRepo.findById(id);
    };
    public User saveUser(String email, String password, String name){
        User u = new User();
        u.setEmail(email);
        u.setPassword(password);
        u.setName(name);
        return userRepo.save(u);
    }
    public List<User> getAllusers(){
        return userRepo.findAll();
    }
}
