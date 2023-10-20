package com.hackathon.enrollmentSystem.enrollmentSystem.service.Impl;

import com.hackathon.enrollmentSystem.enrollmentSystem.repository.ApplicationRepository;
import com.hackathon.enrollmentSystem.enrollmentSystem.service.StatisticsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import playload.Statistics;

import java.util.List;

@Service
@AllArgsConstructor
public class StatisticsServiceImpl implements StatisticsService {

    private ApplicationRepository applicationRepository;

    @Override
    public Statistics getStatistics() {

        Object result = applicationRepository.findStatistics();

        Statistics statistics = new Statistics();
        statistics.setTotalOfApplication((Long) result);
        statistics.setTotalPending(((Long) result) - 1);
        statistics.setTotalAccepted( ((Long) result) - 2 );
        statistics.setTotalRefused( 0 );
        return statistics;
    }
}
