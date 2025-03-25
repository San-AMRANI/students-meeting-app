package com.steet.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steet.demo.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUserName(String userName);
    User findByEmail(String email);
    User findByUserNameOrEmail(String userName, String email);
}
