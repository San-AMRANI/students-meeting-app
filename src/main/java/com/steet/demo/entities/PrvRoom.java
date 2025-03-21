package com.steet.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrvRoom extends Room {
    private boolean isPrivate;
    private User createdBy;
    @OneToMany(mappedBy = "room")
    private Membership membership;
}
