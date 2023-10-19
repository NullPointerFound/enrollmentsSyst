package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Note;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.User;
import com.hackathon.enrollmentSystem.enrollmentSystem.exception.ResourceNotFound;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.ApplicationRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.CourseRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.NoteRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Random;

@AllArgsConstructor
@Component
public class ServiceHelper {

    private UserRepository userRepository;
    private CourseRepository courseRepository;

    private ApplicationRepository applicationRepository;

    private NoteRepository noteRepository;

    // find the authenticated user
    protected User getAuthenticatedUser(){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = userRepository.findByUsernameOrEmail(username, username).orElseThrow(
                ()->  new ResourceNotFound("User","Username or Email",username)
        );

        return user;
    }

    protected Application getApplicationByIdOrThrowNoFoundException(Long applicationId) {
        Application applicationFound = applicationRepository.findById(applicationId).orElseThrow(
                () -> new ResourceNotFound("Application","ID", applicationId)
        );
        return applicationFound;
    }
    protected Note getNoteByIdOrThrowNoFoundException(Long noteId) {
        Note noteFound = noteRepository.findById(noteId).orElseThrow(
                () -> new ResourceNotFound("Note","ID", noteId)
        );
        return noteFound;
    }

    protected static int generateRandomNumber() {
        // Define the range of possible 7-digit numbers
        int min = 1000000;
        int max = 9999999;

        // Create an instance of the Random class
        Random random = new Random();

        // Generate and return a random number within the specified range
        return random.nextInt((max - min) + 1) + min;
    }

    protected Course getCourseByIdOrThrowNoFoundException(Long courseId) {
        Course courseFound = courseRepository.findById(courseId).orElseThrow(
                () -> new ResourceNotFound("Course","ID", courseId)
        );
        return courseFound;
    }

    protected Application getApplicationByTrackingOrThrowNoFoundException(Integer tracking) {
        Application applicationFound = applicationRepository.findByTracking(tracking).orElseThrow(
                () -> new ResourceNotFound("Application","tracking", tracking)
        );
        return applicationFound;
    }
}