package com.steet.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steet.demo.entities.Membership;

public interface MemberShipRepository extends JpaRepository<Membership,UUID>{
    
}
