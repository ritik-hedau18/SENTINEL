package com.ritikhedau.sentinel.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "incidents")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String severity;
    private String status; // OPEN, ACKNOWLEDGED, RESOLVED
    private Long assigneeId;
    private String alertIds; // comma-separated alert IDs
    private LocalDateTime createdAt;
    private LocalDateTime resolvedAt;
// minor tweak: performance check updates
}

// minor tweak: update verification rules and configs
