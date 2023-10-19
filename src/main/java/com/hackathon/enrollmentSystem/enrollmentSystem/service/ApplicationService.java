package com.hackathon.enrollmentSystem.enrollmentSystem.service;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Status;
import playload.CheckStatus;
import playload.CheckStatusResponse;

import java.util.List;

public interface ApplicationService {

    public Application createNewApplication(Application application, Long courseId);

    public void deleteApplicationById(Long applicationId);

    public Application updateApplicationById(Long applicationId, Application application);

    public List<Application> getAllApplications();

    public Application getApplicationById(Long applicationId);

    public CheckStatusResponse checkStatusOfApplication(CheckStatus checkStatus);

    public String changeApplicationStatus(Long applicationId, Status status);
}
