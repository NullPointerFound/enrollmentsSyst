package com.hackathon.enrollmentSystem.enrollmentSystem.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class EnrollmentSystemApiException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public EnrollmentSystemApiException(String message,HttpStatus status) {
        super(String.format("%s",message));
        this.message = message;
        this.status = status;
    }
}
