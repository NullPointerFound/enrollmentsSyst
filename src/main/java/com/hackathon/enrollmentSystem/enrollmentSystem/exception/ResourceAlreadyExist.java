package com.hackathon.enrollmentSystem.enrollmentSystem.exception;

public class ResourceAlreadyExist extends RuntimeException{

    private String resourceName;
    private String fieldName;
    private String fieldValue;


    public ResourceAlreadyExist(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s already exist with %s : %s ",resourceName,fieldName,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
