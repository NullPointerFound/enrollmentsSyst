package com.hackathon.enrollmentSystem.enrollmentSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Application extends BaseId{

    private String fullName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    @CreationTimestamp
    private LocalDateTime date;
    private String Address;
    private Status status;

    @JsonIgnore
    private String note;

    @OneToOne
    private Course course;

    private Long Tracking;


}
