package com.ritikhedau.sentinel.controller;
import com.ritikhedau.sentinel.service.LogIngestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logs")
public class LogController {
    @Autowired private LogIngestionService service;

    @PostMapping("/ingest")
    public ResponseEntity<Void> ingest(@RequestBody String logLine) {
        service.ingestLogLine(logLine);
        return ResponseEntity.ok().build();
    }
}