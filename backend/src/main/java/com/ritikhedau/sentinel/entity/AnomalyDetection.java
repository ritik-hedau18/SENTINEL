package com.ritikhedau.sentinel.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "anomaly_detections")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnomalyDetection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long logEntryId;
    private Long serviceId;
    private Double anomalyScore;
    private String description;
    private LocalDateTime detectedAt;
// minor tweak: performance check updates
}
