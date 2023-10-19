package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.User;
import com.hackathon.enrollmentSystem.enrollmentSystem.exception.ResourceAlreadyExist;
import com.hackathon.enrollmentSystem.enrollmentSystem.repository.UserRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.security.JwtTokenProvider;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import playload.SignDto;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    private AuthenticationManager authenticationManager;

    private JwtTokenProvider jwtTokenProvider;

    @Override
    public void registerUser(User user) {

        if (userRepository.existsByUsername(user.getUsername())){
            throw new ResourceAlreadyExist("User","Username",user.getUsername());
        }

        // Check for email if exists in a DB
        if (userRepository.existsByEmail(user.getEmail())){
            throw new ResourceAlreadyExist("User","Email",user.getEmail());
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);

    }

    @Override
    public String login(SignDto signDto) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                signDto.getUsernameOrEmail(), signDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtTokenProvider.generateToken(authentication);

        return token;
    }
}
