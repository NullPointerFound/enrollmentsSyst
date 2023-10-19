package com.hackathon.enrollmentSystem.enrollmentSystem.service;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;

import java.util.List;

public interface ApplicationService {

    public Application createNewApplication(Application application);

    public String deleteApplicationById(Long applicationId);

    public Application updateApplicationById(Long applicationId, Application application);

    public List<Application> getAllApplications();

    public Application getApplicationById(Long applicationId);
}
