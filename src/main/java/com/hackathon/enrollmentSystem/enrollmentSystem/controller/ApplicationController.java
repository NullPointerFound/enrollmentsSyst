package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import playload.CheckStatus;
import playload.CheckStatusResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/application")
@AllArgsConstructor
public class ApplicationController {

    private ApplicationService applicationService;

    @PostMapping("/{courseId}")
    public Application newApplication(@RequestBody Application application, @PathVariable Long courseId){

        return applicationService.createNewApplication(application,courseId);
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
    public Application getApplicationById(@PathVariable Long applicationId){
        return applicationService.getApplicationById(applicationId);
    }

    @GetMapping("/checkStatus")
    public CheckStatusResponse checkStatusOfApplication(@RequestBody CheckStatus checkStatus){

        return applicationService.checkStatusOfApplication(checkStatus);
    }
}
