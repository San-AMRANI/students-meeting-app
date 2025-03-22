package com.steet.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steet.demo.entities.Student;

public interface StudentRepository extends JpaRepository<Student, UUID> {
    
}
