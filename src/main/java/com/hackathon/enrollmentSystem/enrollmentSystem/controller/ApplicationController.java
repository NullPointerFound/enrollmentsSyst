package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Status;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.ApplicationService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import playload.CheckStatus;
import playload.CheckStatusResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/application")
@AllArgsConstructor
public class ApplicationController {

    private ApplicationService applicationService;

    @Operation(summary = "Making a new application", description = "Creating a new admin")
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

    @PostMapping("/{applicationId}/{status}")
    public String changeApplicationStatus(@PathVariable(name = "applicationId") Long applicationId, @PathVariable(name = "status") String status){

        Status AppStatus = Status.valueOf(status);

        return applicationService.changeApplicationStatus(applicationId, AppStatus);
    }
}
