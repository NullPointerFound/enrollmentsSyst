package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/application")
@AllArgsConstructor
public class ApplicationController {

    private ApplicationService applicationService;

    @PostMapping
    public Application newApplication(@RequestBody Application application){
        return applicationService.createNewApplication(application);
    }

    @DeleteMapping("/{applicationId}")
    public String deleteApplicationById(@PathVariable Long applicationId){
        applicationService.deleteApplicationById(applicationId);
        return "Application has been deleted";
    }

    @PutMapping("/{applicationId}")
    public Application updateApplicationById(Long applicationId, Application application){
        return applicationService.updateApplicationById(applicationId, application);
    }


    @GetMapping
    public List<Application> getAllApplications(){
        return applicationService.getAllApplications();
    }

    @GetMapping("/{applicationId}")
    public Application getApplicationById(Long applicationId){
        return applicationService.getApplicationById(applicationId);
    }
}
