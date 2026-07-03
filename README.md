# UC13: Functional Logging (Traceability)

## Overview

This use case extends the Audit Logging system by introducing **Functional Logging**. Every successful business transaction automatically generates a log entry, providing complete traceability of important activities within the ClinicOps application.

The system records successful operations such as **Doctor Registration** and **Appointment Booking**, allowing administrators to monitor when and what data was added to the system.

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

Implement event-driven functional logging so that every successful business operation is automatically recorded in the audit log.

---

# Features Implemented

* Functional logging for doctor registration.
* Functional logging for appointment booking.
* Automatic log generation after successful business transactions.
* Timestamped audit entries.
* View all logs from the Admin Menu.
* Improved traceability of application events.

---

# Functional Logging

Whenever a business transaction completes successfully, the system automatically records a log entry.

### Doctor Registration


[03-07-2026 12:45:20] [INFO]
Doctor Registered Successfully :
D0001 - VASANTHA (DERMATOLOGY)
```

### Appointment Booking


[03-07-2026 12:50:15] [INFO]
Appointment Booked Successfully :
Patient P0001 -> Doctor D0001
Slot : 09:30 AM
```

---

# Event-Driven Workflow


Business Event
      │
      ▼
Operation Completed Successfully
      │
      ▼
AuditLogger.log(message, level)
      │
      ▼
Generate Timestamp
      │
      ▼
Store Log Entry
      │
      ▼
Display Through Admin Menu
```

---

# Sample Audit Log


========== AUDIT LOGS ==========

[03-07-2026 12:45:20] [INFO] Doctor Registered Successfully : D0001 - VASANTHA (DERMATOLOGY)

[03-07-2026 12:45:28] [INFO] Doctor Registered Successfully : D0002 - R (NEUROLOGY)

[03-07-2026 12:45:35] [INFO] Doctor Registered Successfully : D0003 - F (PEDIATRICS)

[03-07-2026 12:52:10] [INFO] Appointment Booked Successfully : Patient P0001 with Dr. VASANTHA at 09:30 AM
```

---

# Concepts Learned

* Event-Driven Programming
* Functional Logging
* Traceability
* Java Collections (`List`)
* Java Time API (`LocalDateTime`, `DateTimeFormatter`)
* Separation of Concerns
* Utility Class Design
* Business Event Tracking

---

# Benefits

* Automatically records successful business transactions.
* Improves traceability across the application.
* Helps administrators monitor system activities.
* Simplifies debugging and auditing.
* Provides a centralized logging mechanism.
* Easily extensible for future business events.

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

* Log patient registration events.
* Log appointment cancellations and rescheduling.
* Add WARNING and ERROR log levels.
* Export audit logs to CSV.
* Search and filter audit logs.
* Store audit logs permanently in a database.

Author
Ragimekalapalli Vasantha
