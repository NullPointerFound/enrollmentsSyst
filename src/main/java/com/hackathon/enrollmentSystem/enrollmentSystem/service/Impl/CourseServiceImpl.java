package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.CourseRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }
}
