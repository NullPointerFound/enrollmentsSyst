package com.hackathon.enrollmentSystem.enrollmentSystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends IdBasedEntity {

    private String fullName;
    private String username;
    private String email;
    private String password;

}
