package com.steet.demo;

import com.steet.demo.entities.*;
import com.steet.demo.entities.Enums.Interests;
import com.steet.demo.entities.Enums.MessageType;
import com.steet.demo.entities.Enums.Role;
import com.steet.demo.entities.Enums.Majors;
import com.steet.demo.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(
            StudentRepository studentRepository, 
            PubRoomRepository pubRoomRepository, 
            ParticipationRepository participationRepository,
            MessageRepository messageRepository) {
        return args -> {
            // Create some students
            Student student1 = new Student("John", "Doe", "john.doe", "john.doe@email.com", "password123", Majors.COMPUTER_SCIENCE, LocalDate.of(1995, 5, 15), List.of(Interests.ART, Interests.CHEMISTRY));
            Student student2 = new Student("Jane", "Smith", "jane.smith", "jane.smith@email.com", "password123", Majors.MATHEMATICS, LocalDate.of(1998, 8, 22), List.of(Interests.ART, Interests.HISTORY));
            Student student3 = new Student("Alice", "Johnson", "alice.johnson", "alice.johnson@email.com", "password123", Majors.PHYSICS, LocalDate.of(2000, 3, 10), List.of(Interests.BIOLOGY, Interests.MATH));

            studentRepository.saveAll(List.of(student1, student2, student3));

            // Create a PubRoom
            PubRoom pubRoom = new PubRoom();
            pubRoom.setName("General Chat");
            pubRoom.setDescription("A room for everyone to chat and collaborate.");
            pubRoom.setCreatedAt(Instant.now());
            pubRoom.setMessages(null);  // Assuming no messages initially
            pubRoom.setParticipation(null);  // No participation initially

            pubRoomRepository.save(pubRoom);

            // Add Participation for the students to the pubRoom
            Participation participation1 = new Participation(null, student1, pubRoom, Instant.now(), null);
            Participation participation2 = new Participation(null, student2, pubRoom, Instant.now(), null);
            Participation participation3 = new Participation(null, student3, pubRoom, Instant.now(), null);

            participationRepository.saveAll(List.of(participation1, participation2, participation3));

            // Optionally, add some initial messages to the room
            Message message1 = new Message(null, pubRoom, student1.getId(), "Hello everyone!", MessageType.TEXT, Instant.now());
            Message message2 = new Message(null, pubRoom, student2.getId(), "Hi John, how are you?", MessageType.TEXT, Instant.now());
            messageRepository.saveAll(List.of(message1, message2));
        };
    }
}
