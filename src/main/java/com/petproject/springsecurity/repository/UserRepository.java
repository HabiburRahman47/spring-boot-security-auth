package com.petproject.springsecurity.repository;

import com.petproject.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
    @Query("select count(u)>0 from User u where u.email = :email")
    boolean existByEmail(@Param("email") String email);
}
