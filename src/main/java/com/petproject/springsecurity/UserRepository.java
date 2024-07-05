package com.petproject.springsecurity;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        return new User(email,"123456","Habibur","Habib");
    }
}
