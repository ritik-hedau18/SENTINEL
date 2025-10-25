package com.ritikhedau.sentinel.controller;

import com.ritikhedau.sentinel.entity.ServiceEntity;
import com.ritikhedau.sentinel.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
    @Autowired
    private ServiceRepository repository;

    @GetMapping
    public ResponseEntity<List<ServiceEntity>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<ServiceEntity> create(@RequestBody ServiceEntity service) {
        return ResponseEntity.ok(repository.save(service));
    }
}