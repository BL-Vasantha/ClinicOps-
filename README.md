# UC12: Logging Infrastructure (Audit Log)

## Overview

This use case introduces an **Audit Logging System** to record important activities performed within the ClinicOps application.

A centralized `AuditLogger` utility is implemented to store log entries with a timestamp and log level. Administrators can view these logs through the **View Audit Logs** option available in the Admin Menu.

---

# Project Structure


ClinicOps/
│
├── model/
│   ├── Appointment.java
│   ├── Doctor.java
│   ├── Patient.java
│   ├── Shift.java
│   └── Specialization.java
│
├── menu/
│   ├── AdminMenu.java
│   └── FrontDeskMenu.java
│
├── util/
│   ├── AuditLogger.java
│   ├── FileHandler.java
│   └── ScannerHelper.java
│
├── doctors.csv
│
└── ClinicApp.java
```

---

# Objective

Implement a centralized logging mechanism to keep track of important system activities and provide administrators with an audit trail.

---

# Features Implemented

* Created `AuditLogger` utility class.
* Implemented `log(String message, String level)` method.
* Stored audit logs using `List<String>`.
* Generated timestamps using the Java Time API.
* Added **View Audit Logs** option in the Admin Menu.
* Logged doctor registration events.
* Logged admin logout events.

---

# Audit Log Format

Each log entry contains:

* Date
* Time
* Log Level
* Activity Description

Example:


[03-07-2026 12:03:28] [INFO] Doctor Registered : VASANTHA
```

---

# Workflow


Admin Action
      │
      ▼
AuditLogger.log(message, level)
      │
      ▼
Generate Timestamp
      │
      ▼
Store Log in List
      │
      ▼
View Audit Logs
```

---

# Sample Output


========== AUDIT LOGS ==========

[03-07-2026 12:03:28] [INFO] Doctor Registered : VASANTHA
[03-07-2026 12:03:38] [INFO] Doctor Registered : F
[03-07-2026 12:03:47] [INFO] Doctor Registered : J
[03-07-2026 12:03:57] [INFO] Admin Logged Out.
```

---

# Concepts Learned

* Object-Oriented Programming (OOP)
* Utility Class Design
* Java Collections (`List`)
* Java Time API (`LocalDateTime`)
* `DateTimeFormatter`
* Logging Infrastructure
* Separation of Concerns

---

# Benefits

* Maintains a history of important system events.
* Makes debugging and monitoring easier.
* Provides a centralized logging mechanism.
* Improves application maintainability.
* Can be extended to log patient registration, appointment booking, cancellations, and errors.

---

# Technologies Used

* Java 17
* IntelliJ IDEA
* Java Collections
* Java Time API
* Object-Oriented Programming (OOP)
* CSV File Handling

---

# Future Enhancements

* Add `WARNING` and `ERROR` log levels.
* Save audit logs to a CSV file.
* Search logs by date.
* Filter logs by log level.
* Export audit logs.
* Maintain persistent audit history across application restarts.

Author
Ragimekalapalli Vasantha
