# 📘 ClinicOps – UC9: Appointment Booking

## Overview

Use Case 9 introduces an appointment booking system that allows the Front Desk Executive to schedule appointments for registered patients. The system checks doctor availability, displays available appointment slots, books the selected slot, and generates the appointment details while preventing duplicate slot bookings.

---

## 🎯 Goal

Book an appointment for a registered patient with an available doctor based on slot availability.

---

## 🚀 Objective

* Book appointments automatically.
* Assign an available doctor.
* Display available appointment slots.
* Prevent double booking.
* Maintain doctor schedules.
* Generate appointment details after successful booking.

---

## 👤 Actor

**Front Desk Executive**

---

## 📌 Assumptions

* Doctor specialization is not considered during appointment booking.
* All doctors are assumed to be available for both shifts.
* Appointments are booked sequentially.
* Each doctor has **16 slots** per day.
* Morning Shift: **9:00 AM – 12:30 PM** (8 slots).
* Evening Shift: **4:00 PM – 7:30 PM** (8 slots).
* Once booked, a slot cannot be booked again.

---

## 🔄 Flow

1. Front Desk Executive selects **Book Appointment**.
2. System asks for the patient's mobile number.
3. Patient details are verified.
4. System displays all available appointment slots.
5. User selects a preferred slot.
6. System finds an available doctor.
7. Appointment is booked successfully.
8. Appointment details are displayed.

---

## ⚙️ Key Functionalities

* Patient Verification
* Appointment Slot Selection
* Doctor Availability Check
* Automatic Doctor Assignment
* Appointment Creation
* Slot Booking Management
* Display Appointment Details

---

## 🏗️ System Changes

### Appointment.java

Stores:

* Patient information
* Doctor information
* Appointment slot

### Doctor.java

Enhanced with:

* Booked slot list
* Slot availability checking
* Slot booking functionality

### FrontDeskMenu.java

Added:

* Appointment booking
* Patient lookup
* Slot selection
* Appointment confirmation

---

## 📂 Folder Structure


ClinicOps
│
├── model
│   ├── Appointment.java
│   ├── Doctor.java
│   ├── Patient.java
│   ├── Shift.java
│   └── Specialization.java
│
├── util
│   ├── FileHandler.java
│   └── ScannerHelper.java
│
├── menu
│   ├── AdminMenu.java
│   └── FrontDeskMenu.java
│
└── ClinicApp.java
```

---

## 📌 Sample Output

### Doctor Registration


Doctors Registered Successfully.
```

### Patient Registration


Register Patient

Mobile Number : 9959777375
Patient Name  : Vasantha
Gender        : Female
Age           : 00

Patient Registered Successfully.
```

### Appointment Booking


Enter Patient Mobile Number : 9959777375

Available Appointment Slots

1. 09:00 AM
2. 09:30 AM
3. 10:00 AM
4. 10:30 AM
5. 11:00 AM
6. 11:30 AM
7. 12:00 PM
8. 12:30 PM
9. 04:00 PM
10. 04:30 PM
11. 05:00 PM
12. 05:30 PM
13. 06:00 PM
14. 06:30 PM
15. 07:00 PM
16. 07:30 PM

Select Slot : 15

Appointment Booked Successfully.

=========== Appointment ===========

Patient ID      : P0001
Patient Name    : Vasantha
Doctor ID       : D0002
Doctor Name     : 2
Appointment Slot: 07:00 PM

===================================
```

### View Patients


========== Patient List ==========

Patient ID : P0001
Name       : Vasantha
Gender     : Female
Age        : 00
Mobile No  : 9959777375

----------------------------------
```

---

## 📚 Concepts Covered

* Object Composition
* Encapsulation
* Linear Search
* Collection Handling
* Appointment Scheduling
* Slot Management
* Doctor Availability
* Inter-Class Communication

---

## 🆚 Improvement Over UC8

| Feature                     | UC8 | UC9 |
| --------------------------- | --- | --- |
| Patient Registration        | ✅   | ✅   |
| Existing Patient Validation | ✅   | ✅   |
| Appointment Booking         | ❌   | ✅   |
| Slot Selection              | ❌   | ✅   |
| Doctor Assignment           | ❌   | ✅   |
| Slot Availability Check     | ❌   | ✅   |
| Appointment Details         | ❌   | ✅   |

---

## 🏁 Conclusion

UC9 extends the ClinicOps application by introducing an appointment booking module. It enables the Front Desk Executive to schedule appointments for registered patients by checking doctor availability and assigning appointment slots. This implementation ensures efficient scheduling, prevents duplicate bookings, and establishes a strong foundation for future enhancements such as doctor specialization, appointment rescheduling, and online appointment management.

Author
Ragimekalapalli Vasantha
