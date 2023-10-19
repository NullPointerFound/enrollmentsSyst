package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.CourseRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return null;
    }

    @Override
    public String deleteCourseById(Long courseId) {
        return null;
    }

    @Override
    public Course updateCourseById(Long courseId, Course course) {
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public Course getCourseById(Long courseId) {
        return null;
    }
}
