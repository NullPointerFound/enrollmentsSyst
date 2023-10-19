package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.ApplicationRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private ApplicationRepository applicationRepository;

    @Override
    public Application createNewApplication(Application application) {

        return applicationRepository.save(application);
    }

    @Override
    public void deleteApplicationById(Long applicationId) {

        if ( applicationRepository.existsById(applicationId)){

        } else
            applicationRepository.deleteById(applicationId);
    }

    @Override
    public Application updateApplicationById(Long applicationId, Application application) {
        return null;
    }

    @Override
    public List<Application> getAllApplications() {
        return null;
    }

    @Override
    public Application getApplicationById(Long applicationId) {
        return null;
    }
}
