package com.hackathon.enrollmentSystem.enrollmentSystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course extends BaseId {

    private String courseName;
    private String description;
    private LocalDate startingDate;
}
