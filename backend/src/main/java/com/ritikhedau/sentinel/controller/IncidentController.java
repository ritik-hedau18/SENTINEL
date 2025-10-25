package com.ritikhedau.sentinel.controller;

import com.ritikhedau.sentinel.entity.Incident;
import com.ritikhedau.sentinel.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {
    @Autowired
    private IncidentRepository repository;

    @GetMapping
    public ResponseEntity<List<Incident>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Incident> create(@RequestBody Incident incident) {
        return ResponseEntity.ok(repository.save(incident));
    }
}