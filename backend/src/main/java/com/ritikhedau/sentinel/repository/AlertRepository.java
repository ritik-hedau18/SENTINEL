package com.ritikhedau.sentinel.repository;

import com.ritikhedau.sentinel.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findByStatus(String status);
// minor tweak: performance check updates
}
