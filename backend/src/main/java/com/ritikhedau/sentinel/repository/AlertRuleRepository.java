package com.ritikhedau.sentinel.repository;

import com.ritikhedau.sentinel.entity.AlertRule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlertRuleRepository extends JpaRepository<AlertRule, Long> {
    List<AlertRule> findByServiceIdAndEnabled(Long serviceId, Boolean enabled);
// minor tweak: performance check updates
// minor tweak: performance check updates
// minor tweak: performance check updates
}

// minor tweak: update verification rules and configs
