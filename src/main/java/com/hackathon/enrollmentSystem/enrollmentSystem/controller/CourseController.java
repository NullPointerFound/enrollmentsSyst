package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.CourseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
@AllArgsConstructor
public class CourseController {
    private CourseService courseService;

//    @Operation(summary = "Adding a Course", description = "Adding a course by passing a course information")
//    @SecurityRequirement(name = "Bearer Authentication")
    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }


//    @Operation(summary = "Deleting a Course by ID", description = "Deleting a course by passing a course id")
//    @SecurityRequirement(name = "Bearer Authentication")
    @DeleteMapping("/{courseId}")
    public String deleteCourseById(@PathVariable Long courseId){
        courseService.deleteCourseById(courseId);
        return "Course has been deleted successfully";
    }

    @Operation(summary = "Updating a specific Course", description = "Updating a specific course by passing a course id")
    @SecurityRequirement(name = "Bearer Authentication")
    @PutMapping("/{courseId}")
    public Course updateCourseById(Long courseId, @RequestBody Course course){
        return courseService.updateCourseById(courseId, course);
    }

    @Operation(summary = "Getting all available Courses", description = "Getting all courses")
    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @Operation(summary = "Get a specific Course by ID", description = "Get a specific course by passing a course ID")
    @GetMapping("/{courseId}")
    public Course getCourseById(@PathVariable Long courseId){
        return courseService.getCourseById(courseId);
    }

}
