                                                    ClinicOps

     Use Case 3: Refactored Doctor Management

          Overview
This use case improves the doctor management module by applying Object-Oriented Programming principles and reducing repetitive code to make the application more scalable and maintainable.

---
       Limitations in Previous Version
- Fixed doctor capacity
- Duplicate code implementation
- Difficult to maintain and extend
- No structured data management

---

      Improvements in UC3
- Introduced **Doctor Model Class** for encapsulation
- Implemented **ArrayList** for dynamic doctor storage
- Added **Auto-generated Doctor IDs** (D0001, D0002...)
- Improved code readability and modularity

---

     Features
- Register Doctor
- Display Registered Doctors
- Dynamic Doctor Data Handling
- Auto-generated Unique IDs

---

      Concepts Used
- OOP (Encapsulation)
- Constructor
- ArrayList
- String Formatting
- Static Memory Persistence

---

             Project Structure

--------------------------------------------------
com.clinicOps
│
├── ClinicApp.java
│
├── model
│   └── Doctor.java
│
├── util
│   └── ScannerHelper.java
│
└── menu
    ├── AdminMenu.java
    └── FrontDeskMenu.java


---------------------
Author
Ragimekalapalli Vasantha
