package com.ritikhedau.sentinel.dto;

import lombok.Data;
import java.util.List;

public class LogDto {

    @Data
    public static class IngestRequest {
        private String serviceName;
        private List<LogLine> logs;
    }

    @Data
    public static class LogLine {
        private String level;
        private String message;
        private String traceId;
        private String spanId;
        private String metadataJson;
    }
// minor tweak: performance check updates
}
