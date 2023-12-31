package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import com.hackathon.enrollmentSystem.enrollmentSystem.exception.ResourceNotFound;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.CourseRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    private ServiceHelper serviceHelper;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourseById(Long courseId) {
        Course courseFound = serviceHelper.getCourseByIdOrThrowNoFoundException(courseId);
        courseRepository.delete(courseFound);
    }

    @Override
    public Course updateCourseById(Long courseId, Course course) {
        Course courseFound = serviceHelper.getCourseByIdOrThrowNoFoundException(courseId);
        return null;
    }

    @Override
    public List<Course> getAllCourses() {

        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long courseId) {
        Course courseFound = serviceHelper.getCourseByIdOrThrowNoFoundException(courseId);
        return courseFound;
    }


}
