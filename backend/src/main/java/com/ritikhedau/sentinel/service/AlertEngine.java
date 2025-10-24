package com.ritikhedau.sentinel.service;
import com.ritikhedau.sentinel.entity.Alert;
import com.ritikhedau.sentinel.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class AlertEngine {
    @Autowired private AlertRepository repo;

    public void triggerAlert(String detail) {
        Alert a = Alert.builder()
            .severity("HIGH")
            .message("Threat keyword match detected in system logs.")
            .details(detail)
            .timestamp(LocalDateTime.now())
            .resolved(false)
            .build();
        repo.save(a);
    }
}