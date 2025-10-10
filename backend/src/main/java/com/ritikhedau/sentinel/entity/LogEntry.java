package com.ritikhedau.sentinel.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "log_entries")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long serviceId;
    private String level; // INFO, WARN, ERROR, FATAL

    @Column(columnDefinition = "TEXT")
    private String message;

    private LocalDateTime timestamp;

    @Column(columnDefinition = "TEXT")
    private String metadataJson;

    private String traceId;
    private String spanId;
}
