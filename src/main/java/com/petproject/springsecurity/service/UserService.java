package com.petproject.springsecurity.service;

import com.petproject.springsecurity.model.User;
import com.petproject.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }

    public void registerNewUser(User user){
        if (userRepository.existByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        userRepository.save(user);
    }
}
