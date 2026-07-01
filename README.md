# ClinicOps - UC5: Bulk Doctor Upload

## Overview

UC5 enables bulk registration of doctors through a CSV file, reducing manual data entry and improving efficiency.

## Features

* Upload multiple doctor records from a CSV file
* Automatically generate doctor IDs
* Validate **Specialization** and **Shift** using enums
* Store uploaded records using **ArrayList**
* Process bulk insertion in a single flow

## CSV Format

```plaintext
Name,Specialization,Experience,Shift
```

### Example

```plaintext
 vasantha ,GENERAL_PHYSICIAN,5,MORNING
```

## Concepts Used

* File I/O (`BufferedReader`)
* `String.split()`
* Enum Validation
* Try-with-resources
* Batch Processing (`addAll`)
* Collection Framework (`ArrayList`)

## Limitations

* Depends on correct CSV structure
* Duplicate record validation not implemented

## Project Structure

```plaintext
ClinicOps/
│
├── menu/
│   └── AdminMenu.java
│      → Handles admin operations and bulk upload menu
│
├── model/
│   ├── Doctor.java
│   ├── Shift.java
│   └── Specialization.java
│      → Contains entity classes and enums
│
├── util/
│   ├── ScannerHelp.java
│   └── FileHandler.java
│      → Handles input support and CSV file processing
│
└── ClinicApp.java
   → Main application entry point
```

## Git Branch

feature/UC5-bulk-data-entry

Author
Ragimekalapalli Vasantha
