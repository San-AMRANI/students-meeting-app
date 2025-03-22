package com.steet.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steet.demo.entities.Participation;

public interface ParticipationRepository extends JpaRepository<Participation,UUID>{
    
}
