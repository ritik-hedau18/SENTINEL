package com.ritikhedau.sentinel.controller;

import com.ritikhedau.sentinel.entity.Alert;
import com.ritikhedau.sentinel.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {
    @Autowired
    private AlertRepository repository;

    @GetMapping
    public ResponseEntity<List<Alert>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Alert> create(@RequestBody Alert alert) {
        return ResponseEntity.ok(repository.save(alert));
    }
}
// minor tweak: update verification rules and configs
