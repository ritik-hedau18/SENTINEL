package com.ritikhedau.sentinel.repository;

import com.ritikhedau.sentinel.entity.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
    List<LogEntry> findByServiceId(Long serviceId);
}
