# UC11: Shift Aware Appointment Booking

## Overview

This use case enhances the appointment booking process by ensuring that appointments are assigned only to doctors who are available during the selected appointment time.

The system validates appointments using three conditions:

- Doctor Specialization
- Doctor Shift Compatibility
- Slot Availability

This prevents invalid bookings, such as assigning a morning appointment to an evening-shift doctor.

---

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
│
└── ClinicApp.java
```

---

## Features Implemented

- Doctor Registration
- Bulk Doctor Data Entry using CSV
- Patient Registration
- Shift Aware Appointment Booking
- Doctor Shift Validation
- Slot Availability Check
- Display Doctors
- Display Patients

---

## Shift Mapping

Each doctor is assigned one of the following shifts:

- **MORNING**
- **EVENING**
- **BOTH**

The selected appointment slot is validated against the doctor's assigned shift before confirming the appointment.

| Shift | Available Slots |
|--------|-----------------|
| MORNING | 09:00 AM – 12:30 PM |
| EVENING | 04:00 PM – 07:30 PM |
| BOTH | All Available Slots |

---

## Appointment Booking Flow


Patient
   │
   ▼
Enter Mobile Number
   │
   ▼
Choose Specialization
   │
   ▼
Select Appointment Slot
   │
   ▼
Filter Doctors
   │
   ├── Match Specialization
   ├── Validate Shift
   └── Check Slot Availability
   │
   ▼
Book Appointment
   │
   ▼
Display Appointment Details
```

---

## Stream Filtering Logic

The doctor list is filtered using Java Stream API.



The filters are applied in the following order:

1. Specialization Filter
2. Shift Compatibility Filter
3. Slot Availability Filter

Only a doctor satisfying all three conditions is selected.

---

## Concepts Learned

- Object-Oriented Programming (OOP)
- Encapsulation
- Java Enums
- Java Collections
- Java Stream API
- Predicate Chaining
- Business Rule Validation
- Shift Mapping
- Method Extraction

---

## Sample Output


Appointment Booked Successfully.

=========== Appointment ===========
Patient ID      : P0001
Patient Name    : GH
Doctor ID       : D0001
Doctor Name     : VASANTHA
Appointment Slot: 09:30 AM
===================================
```

---

## Benefits

- Prevents invalid appointment bookings.
- Ensures appointments are assigned only during doctor working hours.
- Improves appointment scheduling accuracy.
- Demonstrates practical use of Java Stream filtering.
- Keeps business logic inside the Doctor model for better maintainability.

---

## Technologies Used

- Java 17
- IntelliJ IDEA
- Java Stream API
- ArrayList
- Enums
- Object-Oriented Programming (OOP)
- CSV File Handling

---

## Future Enhancements

- Audit Log Implementation
- Appointment Cancellation
- Appointment Rescheduling
- Doctor-wise Appointment History
- Daily Appointment Reports
- Database Integration
Author
Ragimekalapalli Vasantha
