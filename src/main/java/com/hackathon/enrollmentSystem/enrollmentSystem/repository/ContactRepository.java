package com.hackathon.enrollmentSystem.enrollmentSystem.repository;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
}
