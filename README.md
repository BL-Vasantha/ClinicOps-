# Use Case 15: Log4j Migration

## Goal

Migrate the application's logging mechanism to **Apache Log4j 2** for a scalable and production-ready logging solution.

## Actor

* Admin

## Flow

* Replace the existing logging mechanism with Log4j 2.
* Configure log levels using `log4j2.xml`.
* Log application events in the console.
* Record important operations across the application.

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
│   ├── FileHandler.java
│   └── ScannerHelper.java
│
├── doctors.csv
├── log4j2.xml
└── ClinicApp.java
```

## Key Changes

* Replaced the previous logging mechanism with **Log4j 2**.
* Added Log4j dependencies to the project.
* Configured logging using `log4j2.xml`.
* Implemented logging in:

    * Admin Menu
    * Front Desk Menu
    * File Handling

## Log Levels

* **INFO** – Successful operations.
* **WARN** – Invalid inputs or unexpected conditions.
* **ERROR** – Exceptions and application failures.

## Concepts Learned

* Log4j 2
* Dependency Management
* Refactoring
* Logging Configuration
* Exception Handling

## Outcome

* Production-ready logging framework.
* Centralized logging configuration.
* Improved debugging and application monitoring.

Author
Ragimekalapalli Vasantha
