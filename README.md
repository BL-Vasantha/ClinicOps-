                                                            # 🏥 ClinicOps

# 🏥 ClinicOps

## 📌 Project Overview
ClinicOps is a console-based Java application developed to simplify day-to-day clinic management operations.  
The system helps move from paper-based processes to a structured digital workflow.

---

## 👨‍⚕️ Use Case 2: Doctor Management

Admin can:

✔ Register details of up to 3 doctors  
✔ View all saved doctor records  
✔ Import doctor details using CSV file

---

## ✨ Features

### 🔐 Admin Operations
- Doctors' Entry
- Bulk Import using CSV
- View Audit Logs *(Upcoming)*
- Display Registered Doctors
- Logout

---

## 🩺 Doctor Information

Each doctor contains:

- Doctor Name *(mandatory)*
- Specialization *(mandatory)*
- Years of Experience *(numeric value)*
- Availability Shift
    - Morning
    - Evening
    - Both

---

## 🏗 Project Structure

```plaintext
com.clinicOps

├── ClinicApp.java
│
├── menu
│   ├── AdminMenu.java
│   └── FrontDeskMenu.java
│
└── util
    └── ScannerHelper.java
