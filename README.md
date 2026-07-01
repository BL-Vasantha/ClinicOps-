# ClinicOps - UC6: Bulk Doctor Data Entry using OpenCSV (Optional)

## 🎯 Goal

Enable bulk upload of doctor details from a `.csv` file using the OpenCSV library with validation, duplicate checking, and controlled error handling.

## 🚀 Objective

UC6 enhances the doctor upload process by:

* Supporting bulk upload through CSV files
* Allowing partial success by skipping invalid records
* Preventing duplicate doctor entries
* Providing detailed validation feedback
* Improving file processing using OpenCSV

## 👤 Actor

**Admin**

## 🔄 Flow

1. Admin selects **Bulk Data Entry** from Admin Menu
2. System asks for CSV file path
3. CSV file is processed using **OpenCSV** (`CSVReader`)
4. Each row is validated and checked for duplicates
5. Valid records are uploaded
6. Invalid records are skipped with messages

## ⚙️ Key Functionalities

### 1.  CSV File Processing

* Reads doctor details using OpenCSV
* Processes records line by line

Expected format:

```plaintext id="b9u8ax"
Name,Specialization,Experience,Shift
```

---

### 2.   Validation Handling

Validation is performed for:

* Specialization
* Shift
* Record structure
* Experience format

If validation fails:

``
Invalid Specialization/Shift : <record>
```

Processing continues for remaining records.

---

### 3. 🔁 Duplicate Record Handling

Duplicate detection is performed using:

* Doctor Name
* Specialization
* Experience

If duplicate exists:

```plaintext id="az8fy5"
Duplicate Doctor Skipped : <name>
```

---

### 4. 🆔 Unique ID Generation

Every valid doctor receives a generated ID.

Example:


D0001
D0002
D0003
```

---

### 5.  Error Handling

Invalid records do not stop processing.

Handled scenarios:

* Incorrect column count
* Invalid specialization
* Invalid shift
* Invalid experience values
* Duplicate entries

## ✅ Advantages over UC5

| Feature                 | UC5            | UC6                |
| ----------------------- | -------------- | ------------------ |
| CSV Processing          | Manual Parsing | OpenCSV            |
| Invalid Record Handling | Stops Process  | Skips Invalid Rows |
| Duplicate Check         | Not Supported  | Implemented        |
| Error Feedback          | Basic          | Detailed           |

## 📌 Example CSV

```plaintext id="gq1srf"
Name,Specialization,Experience,Shift

Vasantha,CARDIOLOGY,5,MORNING
Manju,NEUROLOGY,8,EVENING
Anita,ORTHOPEDICS,3,AFTERNOON
Manu,DERMATOLOGY,6,MORNING
HARI,GENERAL_PHYSICIAN,10,EVENING
-------------------

## 📦 Dependencies

* OpenCSV Library


## Project Structure

```plaintext id="vhs8x6"
ClinicOps/
│
├── menu/
│   └── AdminMenu.java
│      → Handles admin menu operations
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
│      → Handles input and CSV processing
│
└── ClinicApp.java
   → Main application entry point
```

## Git Branch


feature/UC6-opencsv-integration
```

## 🏁 Conclusion

UC6 improves bulk doctor upload by introducing OpenCSV-based processing, validation, duplicate prevention, and fault-tolerant execution to ensure successful handling of valid records.


Author
Ragimekalapalli Vasantha
