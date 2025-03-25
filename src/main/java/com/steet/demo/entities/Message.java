package com.steet.demo.entities;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import com.steet.demo.entities.Enums.MessageType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id @GeneratedValue(generator = "UUID")
    @UuidGenerator
    private UUID id;
    
    @ManyToOne
    private Room room;

    private UUID sender_id;

    private String content;

    @Enumerated(EnumType.STRING)
    private MessageType type; // Enum for TEXT/IMAGE

    private Instant timestamp;
}
