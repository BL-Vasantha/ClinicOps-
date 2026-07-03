# ClinicOps – UC14: Error & Security Logging

## Overview

UC14 introduces **Error & Security Logging** to improve application reliability and traceability. The system records successful operations, invalid inputs, and exceptions using different log levels.

## Project Structure


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

## Features

* Bulk doctor import from CSV.
* Manual doctor registration.
* Patient registration.
* Shift-aware appointment booking.
* INFO, WARNING, and ERROR audit logs.
* Invalid CSV record detection.
* Duplicate doctor validation.
* Exception handling for CSV upload failures.

## Concepts Learned

* Exception Handling
* Defensive Programming
* Security Logging
* Java Collections
* Java Time API
* File Handling
* OpenCSV

Author
Ragimekalapalli Vasantha
