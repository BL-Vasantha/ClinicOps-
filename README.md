# ClinicOps - UC4: Enum-Based Validation

## Overview

UC4 improves input reliability and maintains consistent data by restricting user entries to predefined values using enums.

## Problem in UC3

* Allowed manual text input for doctor details
* Increased chance of invalid values and typos
* Reduced data consistency

## Solution

* Introduced **Enum** for `Shift` and `Specialization`
* Implemented a **generic method** for enum selection
* Added validation to prevent unsupported inputs

## Features

* Register doctors with validated selections
* Menu-based fixed value input
* Improved data consistency and cleaner output

## Concepts Used

* Enums
* Generics
* Input Validation
* Object-Oriented Programming (OOP)

## Project Structure

```plaintext
ClinicOps/
│
├── menu/
│   └── DoctorMenu.java
│      → Handles user interaction and menu operations
│
├── model/
│   ├── Doctor.java
│   ├── Shift.java
│   └── Specialization.java
│      → Contains entity classes and enums
│
├── util/
│   └── ScannerHelp.java
│      → Handles scanner operations and input support
│
└── ClinicApp.java
   → Main entry point of the application
```

## Git Branch

feature/UC4-enum-based-selection


Author
Ragimekalapalli Vasantha
