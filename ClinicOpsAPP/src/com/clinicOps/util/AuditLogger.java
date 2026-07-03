package com.clinicOps.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AuditLogger {

    private static final List<String> auditLogs = new ArrayList<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private AuditLogger() {
    }

    public static void log(String level, String message) {
        String logEntry = "[" + LocalDateTime.now().format(formatter) + "] "
                + "[" + level + "] "
                + message;
        auditLogs.add(logEntry);
    }

    public static void displayLogs() {
        if (auditLogs.isEmpty()) {
            System.out.println("\nNo Audit Logs Available.");
            return;
        }
        System.out.println("\n========== AUDIT LOGS ==========");
        auditLogs.forEach(System.out::println);
    }

    public static List<String> getLogs() {
        return auditLogs;
    }
}