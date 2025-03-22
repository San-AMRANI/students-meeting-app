package com.steet.demo.entities;

import java.time.LocalDate;
import java.util.List;

import com.steet.demo.entities.Enums.Interests;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    private LocalDate dbo;
    @Enumerated(EnumType.STRING)
    private List<Interests> interest;
    @OneToMany(mappedBy = "student")
    private Membership membership;
}
