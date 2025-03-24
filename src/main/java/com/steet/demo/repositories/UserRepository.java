package com.steet.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steet.demo.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    // User findByUsername(String username);
    // User findByEmail(String email);
    // User findByUsernameOrEmail(String username, String email);
    // Boolean existsByUsername(String username);
    // Boolean existsByEmail(String email);
}
