package com.ritikhedau.sentinel.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.regex.Pattern;

@Service
public class LogIngestionService {
    @Autowired private AlertEngine alertEngine;
    private static final Pattern THREAT_PATTERN = Pattern.compile("(?i)(unauthorized|attack|exploit|injection|bruteforce)");

    public void ingestLogLine(String logLine) {
        if (THREAT_PATTERN.matcher(logLine).find()) {
            alertEngine.triggerAlert(logLine);
        }
    }
}