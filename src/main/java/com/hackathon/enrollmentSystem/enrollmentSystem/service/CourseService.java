package com.hackathon.enrollmentSystem.enrollmentSystem.service;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;

import java.util.List;

public interface CourseService {

    public Course createCourse(Course course);

    public String deleteCourseById(Long courseId);

    public Course updateCourseById(Long courseId, Course course);

    public List<Course> getAllCourses();

    public Course getCourseById(Long courseId);
}
