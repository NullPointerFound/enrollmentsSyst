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


    private ServiceHelper serviceHelper;

    @Override
    public Application createNewApplication(Application application, Long courseId) {

        Course courseFound = serviceHelper.getCourseByIdOrThrowNoFoundException(courseId);
        application.setCourse(courseFound);
        application.setStatus(Status.REVIEWING);
        application.setTracking(serviceHelper.generateRandomNumber());
        return applicationRepository.save(application);
    }

    @Override
    public void deleteApplicationById(Long applicationId) {

        Application applicationFound = serviceHelper.getApplicationByIdOrThrowNoFoundException(applicationId);
        applicationRepository.delete(applicationFound);
    }

    @Override
    public Application updateApplicationById(Long applicationId, Application application) {

        Application applicationFound = serviceHelper.getApplicationByIdOrThrowNoFoundException(applicationId);

        return null;
    }

    @Override
    public List<Application> getAllApplications() {

        return applicationRepository.findAll();
    }

    @Override
    public Application getApplicationById(Long applicationId) {

        Application applicationFound = serviceHelper.getApplicationByIdOrThrowNoFoundException(applicationId);

        return applicationFound;
    }

    @Override
    public CheckStatusResponse checkStatusOfApplication(CheckStatus checkStatus) {

        Application applicationFound = serviceHelper.getApplicationByTrackingOrThrowNoFoundException(checkStatus.getTrackingNumber());

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

    @Override
    public String changeApplicationStatus(Long applicationId, Status status) {

        Application foundApplication = serviceHelper.getApplicationByIdOrThrowNoFoundException(applicationId);

        if ( foundApplication.getStatus() != status){
            foundApplication.setStatus(status);
            applicationRepository.save(foundApplication);
            return "Status has been changed successfully";
        } else
            return "Status remained the same";
    }



}
