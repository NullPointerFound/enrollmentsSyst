package com.hackathon.enrollmentSystem.enrollmentSystem.repository;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
