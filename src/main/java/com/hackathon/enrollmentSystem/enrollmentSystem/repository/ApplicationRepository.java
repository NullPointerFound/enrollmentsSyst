package com.hackathon.enrollmentSystem.enrollmentSystem.repository;

import com.hackathon.enrollmentSystem.enrollmentSystem.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import playload.Statistics;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    Optional<Application> findByEmail(String email);

    Optional<Application> findByTracking(Integer tracking);

    @Query("SELECT " +
            "COUNT(*) AS totalOfApplications " +
            "FROM Application")
    Object findStatistics();
}
