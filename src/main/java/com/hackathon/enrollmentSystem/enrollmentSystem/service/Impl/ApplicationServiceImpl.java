package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Course;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Status;
import com.hackathon.enrollmentSystem.enrollmentSystem.exception.ResourceNotFound;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.ApplicationRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.CourseRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import playload.CheckStatus;
import playload.CheckStatusResponse;

import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private ApplicationRepository applicationRepository;
    private CourseRepository courseRepository;

    @Override
    public Application createNewApplication(Application application, Long courseId) {

        Course courseFound = courseRepository.findById(courseId).orElseThrow(
                () -> new ResourceNotFound("Course","ID", courseId)
        );
        application.setCourse(courseFound);
        application.setStatus(Status.Reviewing);
        application.setTracking(generateRandomNumber());
        return applicationRepository.save(application);
    }

    @Override
    public void deleteApplicationById(Long applicationId) {

        Application applicationFound = getApplicationByIdOrThrowNoFoundException(applicationId);
        applicationRepository.delete(applicationFound);
    }

    @Override
    public Application updateApplicationById(Long applicationId, Application application) {

        Application applicationFound = getApplicationByIdOrThrowNoFoundException(applicationId);

        return null;
    }

    @Override
    public List<Application> getAllApplications() {

        return applicationRepository.findAll();
    }

    @Override
    public Application getApplicationById(Long applicationId) {

        Application applicationFound = getApplicationByIdOrThrowNoFoundException(applicationId);

        return applicationFound;
    }

    @Override
    public CheckStatusResponse checkStatusOfApplication(CheckStatus checkStatus) {

        Application applicationFound = getApplicationByEmailOrThrowNoFoundException(checkStatus.getEmail());

        if (applicationFound.getTracking().equals(checkStatus.getTrackingNumber())) {
            CheckStatusResponse checkStatusResponse = new CheckStatusResponse();
            checkStatusResponse.setFullName(applicationFound.getFullName());
            checkStatusResponse.setEmail(applicationFound.getEmail());
            checkStatusResponse.setDate(applicationFound.getDate());
            checkStatusResponse.setCourse(applicationFound.getCourse());
            checkStatusResponse.setStatus(applicationFound.getStatus());
            checkStatusResponse.setTracking(applicationFound.getTracking());
            return checkStatusResponse;
        } else
            throw new ResourceNotFound("Application","tracking", checkStatus.getTrackingNumber());
    }


    private Application getApplicationByEmailOrThrowNoFoundException(String email) {
        Application applicationFound = applicationRepository.findByEmail(email).orElseThrow(
                () -> new ResourceNotFound("Application","email", email)
        );
        return applicationFound;
    }

    // utility Function
    private Application getApplicationByIdOrThrowNoFoundException(Long applicationId) {
        Application applicationFound = applicationRepository.findById(applicationId).orElseThrow(
                () -> new ResourceNotFound("Application","ID", applicationId)
        );
        return applicationFound;
    }

    public static int generateRandomNumber() {
        // Define the range of possible 7-digit numbers
        int min = 1000000;
        int max = 9999999;

        // Create an instance of the Random class
        Random random = new Random();

        // Generate and return a random number within the specified range
        return random.nextInt((max - min) + 1) + min;
    }
}
