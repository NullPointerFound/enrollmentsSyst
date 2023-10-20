package com.hackathon.enrollmentSystem.enrollmentSystem.controller;

import com.hackathon.enrollmentSystem.enrollmentSystem.service.StatisticsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import playload.Statistics;

@RestController
@RequestMapping("/api/v1/statistics")
@AllArgsConstructor
public class StatisticsController {

    private StatisticsService statisticsService;

    @GetMapping
    public Statistics getStatistics(){

        return statisticsService.getStatistics();
    }

}
