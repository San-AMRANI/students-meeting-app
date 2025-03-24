package com.steet.demo.entities;

import java.time.LocalDate;
import java.util.List;

import com.steet.demo.entities.Enums.Interests;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User {
    private String major;
    private LocalDate dob;

    @ElementCollection
    @CollectionTable(name = "student_interests", joinColumns = @JoinColumn(name = "student_id"))
    @Enumerated(EnumType.STRING)
    private List<Interests> interest;

    // the participation of the student in public rooms 
    @OneToMany(mappedBy = "student")
    private List<Participation> participations;

    // memberships of the student on private rooms
    @OneToMany(mappedBy = "student")
    private List<Membership> memberships;
}