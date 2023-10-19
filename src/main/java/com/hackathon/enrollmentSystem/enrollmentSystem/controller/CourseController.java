package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/course")
@AllArgsConstructor
public class CourseController {
    private CourseService courseService;

    @PostMapping
    public Course createCourse(@RequestBody Course course){

        return courseService.createCourse(course);
    }


    @DeleteMapping("/{courseId}")
    public String deleteCourseById(@PathVariable Long courseId){
        courseService.deleteCourseById(courseId);
        return "Course has been deleted successfully";
    }

    @PutMapping("/{courseId}")
    public Course updateCourseById(Long courseId, @RequestBody Course course){
        return courseService.updateCourseById(courseId, course);
    }

    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{courseId}")
    public Course getCourseById(Long courseId){
        return courseService.getCourseById(courseId);
    }

}
