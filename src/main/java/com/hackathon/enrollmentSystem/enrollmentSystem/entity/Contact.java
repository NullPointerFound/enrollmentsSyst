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
public class Contact extends BaseId {

    private String fullName;
    private String email;
    private String Body;

}
