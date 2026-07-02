# 📘 ClinicOps – UC10: Appointment Booking by Specialization

## Overview

Use Case 10 enhances the appointment booking process by assigning patients to doctors based on the required specialization. The system filters doctors using the selected specialization, checks slot availability, and books the appointment with the first eligible doctor.

---

## 🎯 Goal

Book an appointment for a patient with a doctor based on specialization and slot availability.

---

## 🚀 Objective

* Book appointments with the appropriate specialist.
* Filter doctors using specialization.
* Check slot availability before booking.
* Improve appointment accuracy and efficiency.

---

## 👤 Actor

**Front Desk Executive**

---

## 📌 Assumptions

* Specialization is mandatory for booking.
* All doctors are available for both shifts.
* Each doctor has **16 appointment slots** per day.
* Morning Shift: **9:00 AM – 12:30 PM**.
* Evening Shift: **4:00 PM – 7:30 PM**.
* Once a slot is booked, it cannot be reused.

---

## 🔄 Flow

1. Select **Book Appointment**.
2. Enter the patient's mobile number.
3. Select the required specialization.
4. System filters doctors by specialization.
5. Checks for an available slot.
6. Books the appointment.
7. Displays appointment details.

---

## ⚙️ Key Functionalities

* Specialization-based doctor selection.
* Doctor filtering using **Stream API**.
* Slot availability check.
* Appointment creation.
* Prevention of duplicate slot booking.

---

## 🏗️ System Changes

### FrontDeskMenu.java

* Added specialization selection.
* Updated appointment booking flow.

### Doctor.java

* Supports specialization-based filtering.
* Maintains booked appointment slots.

### Appointment.java

Stores:

* Patient
* Doctor
* Appointment Slot

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

### Successful Booking


Enter Patient Mobile Number : 9959777375

Select Specialization
1. CARDIOLOGY
2. DERMATOLOGY
3. ORTHOPEDICS
4. PEDIATRICS
5. GENERAL_PHYSICIAN
6. NEUROLOGY

Enter Choice : 1

Appointment Booked Successfully.

Doctor : Dr. Vasantha
Specialization : CARDIOLOGY
Appointment Slot : 09:30 AM
```

### No Matching Doctor


No doctors available for the selected specialization.
```

### No Available Slots


No slots available.

Please try again later.
```

---

## 📚 Concepts Covered

* Stream API (`filter()`, `findFirst()`)
* Enum Comparison
* Functional Programming
* Encapsulation
* Appointment Scheduling
* Slot Management

---

## 🆚 Improvement Over UC9

| Feature               | UC9                  | UC10                |
| --------------------- | -------------------- | ------------------- |
| Appointment Booking   | ✅                    | ✅                   |
| Specialization Filter | ❌                    | ✅                   |
| Doctor Selection      | Any Available Doctor | Matching Specialist |
| Stream API            | ❌                    | ✅                   |

---

## 🏁 Conclusion

UC10 improves appointment booking by matching patients with doctors based on specialization while ensuring slot availability. This provides more accurate scheduling and creates a strong foundation for future enhancements such as specialist availability tracking, priority appointments, and online booking.

Author
Ragimekalapalli Vasantha
