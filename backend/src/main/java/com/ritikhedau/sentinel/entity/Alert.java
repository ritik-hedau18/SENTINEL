package com.ritikhedau.sentinel.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "alerts")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ruleId;
    private Long serviceId;
    private String message;
    private String severity;
    private String status; // ACTIVE, RESOLVED
    private LocalDateTime triggeredAt;
    private LocalDateTime resolvedAt;
}
