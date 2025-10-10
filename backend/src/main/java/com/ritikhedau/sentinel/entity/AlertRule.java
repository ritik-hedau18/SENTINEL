package com.ritikhedau.sentinel.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "alert_rules")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlertRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long serviceId;
    private String condition; // e.g. ERROR_RATE
    private Double threshold; // e.g. 5.0
    private Integer windowMinutes; // e.g. 5
    private String severity; // WARNING, CRITICAL
    private Boolean enabled;
// minor tweak: performance check updates
// minor tweak: performance check updates
}
