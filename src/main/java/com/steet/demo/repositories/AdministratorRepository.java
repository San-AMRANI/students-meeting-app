package com.steet.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steet.demo.entities.Admistrator;

public interface AdministratorRepository extends JpaRepository<Admistrator,UUID>{
    
}
