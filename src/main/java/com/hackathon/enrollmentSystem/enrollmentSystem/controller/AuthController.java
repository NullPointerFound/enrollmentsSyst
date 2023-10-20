package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.User;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import playload.JWTAuthResponse;
import playload.SignDto;

@RestController
@RequestMapping("api/v1/auth")
@AllArgsConstructor
public class AuthController {

    private AuthService authService;

    @Operation(summary = "Register a new admin", description = "Creating a new admin")
    @SecurityRequirement(name = "Bearer Authentication")
    @PostMapping("/register")
    public String registerUser(@RequestBody User user){

        authService.registerUser(user);

        return "User registered successfully";
    }

    @Operation(summary = "Sign in to Dashboard for admin Management", description = "Sign in to Dashboard for admin Management")
    @PostMapping("/signin")
    public ResponseEntity<JWTAuthResponse> signIn(@RequestBody SignDto signDto){

        String token = authService.login(signDto);

        return ResponseEntity.ok(new JWTAuthResponse(token));

    }
}
