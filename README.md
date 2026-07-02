# 📘 ClinicOps – Check Duplicate Patient by Mobile Number

## Overview

Use Case 8 improves the patient registration process by checking whether a patient is already registered using their mobile number. This helps avoid duplicate records and makes registration faster for returning patients.

---

## 🎯 Goal

Prevent duplicate patient registration using the patient's mobile number.

---

## 🚀 Objective

* Avoid duplicate patient records.
* Improve registration efficiency.
* Reduce unnecessary data entry.
* Use the mobile number as a unique identifier.

---

## 👤 Actor

**Front Desk Executive**

---

## 🔄 Flow

1. Front Desk Executive selects **Patient Registration**.
2. System asks for the patient's mobile number.
3. The mobile number is validated.
4. If the mobile number already exists:

    * Display the patient's details.
    * Show a welcome message.
    * Stop the registration process.
5. If the mobile number does not exist:

    * Collect Name, Gender, and Age.
    * Register the patient successfully.

---

## ⚙️ Key Functionalities

* Mobile Number Validation
* Existing Patient Lookup using Linear Search
* Duplicate Registration Prevention
* Conditional Registration Flow
* Display Existing Patient Details
* Register New Patient Only

---

## 🏗️ Folder Structure

```text
ClinicOps
│
├── model
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

### New Patient Registration

```text
Register Patient

Mobile Number : 9959777376
Patient Name  : Vasantha
Gender        : Female
Age           : 00

Patient Registered Successfully.
```

---

### Existing Patient

```text
Register Patient

Mobile Number : 9959777375

Patient already registered!

Welcome back Vasantha
```

---

### Invalid Mobile Number

```text
Register Patient

Mobile Number : vasantha

Invalid Indian Mobile Number.

Mobile Number :
```

---

## 📚 Concepts Covered

* Linear Search
* Encapsulation
* Getter Methods
* Input Validation
* Conditional Workflow
* Duplicate Data Prevention
* Null Handling

---

## 🆚 Improvement Over UC7

| Feature                  | UC7        | UC8          |
| ------------------------ | ---------- | ------------ |
| Duplicate Patient Check  | ❌ No       | ✅ Yes        |
| Mobile Number Validation | ❌ No       | ✅ Yes        |
| Existing Patient Lookup  | ❌ No       | ✅ Yes        |
| Duplicate Prevention     | ❌ No       | ✅ Yes        |
| Registration Flow        | Name First | Mobile First |
| User Experience          | Basic      | Improved     |

---

## 🏁 Conclusion

UC8 strengthens the patient registration module by validating the mobile number before registration and checking whether the patient already exists. This prevents duplicate records, improves data consistency, and provides a smoother registration experience for both new and returning patients.

Author
Ragimekalapalli Vasantha
