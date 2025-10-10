package com.ritikhedau.sentinel.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "services")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    private String description;
    private String environment; // production, staging, development
    private String status; // HEALTHY, WARNING, CRITICAL
    private LocalDateTime lastHeartbeat;
}

// minor tweak: update verification rules and configs
