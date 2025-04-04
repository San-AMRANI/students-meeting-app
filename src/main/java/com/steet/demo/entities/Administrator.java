package com.steet.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Administrator extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    public Administrator(String firstName, String lastName, String username, String email, String password) {
        super(null, firstName, lastName, username, email, password);
    }
}