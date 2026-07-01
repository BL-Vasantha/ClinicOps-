# ClinicOps - UC7: Register Patient Data

## 🎯 Goal

Enable the Front Desk Executive to register and manage patient information with validation and automatic ID generation.

## 🚀 Objective

UC7 introduces patient management by:

* Registering patient details
* Validating Indian mobile numbers
* Generating unique patient IDs
* Providing an option to view registered patients

## 👤 Actor

**Front Desk Executive**

## 🔄 Flow

1. Front Desk Executive selects **Register Patient**
2. Enters patient details:

    * Name
    * Gender
    * Age
    * Mobile Number
3. System validates the mobile number
4. System generates a unique Patient ID
5. Patient data is stored successfully
6. User can select **View Patients** to display all registered patients

## ⚙️ Key Functionalities

### 1. 🧾 Patient Registration

Required fields:


Name
Gender
Age
Mobile Number
```

Patient information is captured through user input and stored in the system.

### 2. 🆔 Unique Patient ID Generation

Each patient receives an automatically generated ID.

**Format:**


P0001
P0002
P0003
```

This ensures unique identification for every patient.

### 3. 📱 Indian Mobile Number Validation

Mobile numbers are validated using Regex.

**Pattern:**

```plaintext
^[6-9][0-9]{9}$
```

**Rules:**

* Must contain exactly 10 digits
* Must start with 6, 7, 8, or 9

If invalid:

```plaintext
Invalid Mobile Number. Please enter a valid Indian number.
```

### 4. 👁️ View Registered Patients

The system provides an option to display all registered patients.

Displayed details:


Patient ID
Name
Gender
Age
Mobile Number
```


### Patient Model

Created a new `Patient.java` class to store patient information.

**Attributes:**

* patientId
* name
* gender
* age
* mobileNumber

### Front Desk Menu

Updated `FrontDeskMenu.java` to:

* Register patient data
* Validate mobile numbers
* Generate patient IDs
* View registered patients

### Scanner Utility

Updated `ScannerHelp.java` to:

* Read user input
* Validate mobile numbers using Regex
* Re-prompt for invalid entries

## 📌 Example

### Input


Name: m
Gender: female
Age: 23
Mobile: 9876543210
```

### Output

```plaintext
Patient Registered Successfully!
Patient ID: P0001
```

## 🧪 Invalid Input Example

### Input


Mobile: 12345
```

### Output


Invalid Mobile Number. Please enter a valid Indian number.
```

## 📚 Concepts Used

* Object-Oriented Programming (OOP)
* Unique ID Generation
* Regex Validation
* Input Handling
* Menu-Driven Programming

## Project Structure


ClinicOps/
│
├── menu/
│   └── FrontDeskMenu.java
│      → Handles patient registration and viewing
│
├── model/
│   ├── Patient.java
│   ├── Doctor.java
│   ├── Shift.java
│   └── Specialization.java
│      → Contains patient, doctor, and enum models
│
├── util/
│   └── ScannerHelp.java
│      → Handles input and mobile validation
│
└── ClinicApp.java
   → Main application entry point
```

## Git Branch


feature/UC7-patient-registration
```

## 🏁 Conclusion

UC7 introduces a structured patient registration module with mobile number validation, unique ID generation, and patient viewing functionality. This improves data accuracy and lays the foundation for future features such as appointments, billing, and medical records.


Author
Ragimekalapalli Vasantha
