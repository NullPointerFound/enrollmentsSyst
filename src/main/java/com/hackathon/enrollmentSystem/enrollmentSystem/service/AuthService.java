package com.hackathon.enrollmentSystem.enrollmentSystem.service;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.User;
import playload.SignDto;

public interface AuthService {

    public void registerUser(User user);

    public String login(SignDto signDto);

}
