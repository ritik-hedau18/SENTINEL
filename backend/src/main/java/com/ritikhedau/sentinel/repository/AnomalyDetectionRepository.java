package com.ritikhedau.sentinel.repository;

import com.ritikhedau.sentinel.entity.AnomalyDetection;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AnomalyDetectionRepository extends JpaRepository<AnomalyDetection, Long> {
    List<AnomalyDetection> findByServiceId(Long serviceId);
}
