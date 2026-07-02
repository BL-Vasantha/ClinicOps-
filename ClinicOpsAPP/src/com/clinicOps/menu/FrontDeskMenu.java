package com.clinicOps.menu;

import com.clinicOps.model.Appointment;
import com.clinicOps.model.Doctor;
import com.clinicOps.model.Specialization;
import com.clinicOps.util.ScannerHelper;

import java.util.ArrayList;
import java.util.List;

public class FrontDeskMenu {

    private static final ArrayList<com.clinicops.model.Patient> patientList = new ArrayList<>();
    private static final List<Appointment> appointmentList = new ArrayList<>();
    private static int patientIdCounter = 1;

    private FrontDeskMenu() {
    }

    public static void showMenu() {
        boolean logout = false;

        while (!logout) {
            displayFrontDeskMenu();

            int choice = ScannerHelper.readInteger("\nEnter your choice : ");

            switch (choice) {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    bookAppointment();
                    break;
                case 3:
                    viewPatients();
                    break;
                case 4:
                    System.out.println("\nLogging out from Front Desk...");
                    logout = true;
                    break;
                default:
                    System.out.println("\nInvalid option. Please enter between 1 and 4.");
            }
        }
    }

    private static void displayFrontDeskMenu() {
        System.out.println("----- FRONT DESK EXECUTIVE MENU -----");
        System.out.println("1. Patient Registration");
        System.out.println("2. Book Appointment");
        System.out.println("3. View Patients");
        System.out.println("4. Logout");
    }

    private static void registerPatient() {
        System.out.println("\nRegister Patient");

        String mobileNumber = ScannerHelper.readMobileNumber("Mobile Number : ");

        com.clinicops.model.Patient existingPatient = findPatientByMobileNumber(mobileNumber);

        if (existingPatient != null) {
            System.out.println("\n=================================");
            System.out.println("Patient Already Registered");
            System.out.println("=================================");
            System.out.println("Welcome Back " + existingPatient.getName() + "!");
            System.out.println(existingPatient);
            return;
        }

        String patientId = String.format("P%04d", patientIdCounter++);
        String name = ScannerHelper.readString("Patient Name : ");
        String gender = ScannerHelper.readString("Gender : ");
        int age = ScannerHelper.readInteger("Age : ");

        com.clinicops.model.Patient patient = new com.clinicops.model.Patient(patientId, name, gender, age, mobileNumber);
        patientList.add(patient);

        System.out.println("\nPatient Registered Successfully.");
    }

    private static void viewPatients() {
        if (patientList.isEmpty()) {
            System.out.println("\nNo Patients Registered.");
            return;
        }

        System.out.println("\n========== Patient List ==========");

        for (com.clinicops.model.Patient patient : patientList) {
            System.out.println(patient);
            System.out.println("----------------------------------");
        }
    }

    private static com.clinicops.model.Patient findPatientByMobileNumber(String mobileNumber) {
        for (com.clinicops.model.Patient patient : patientList) {
            if (patient.getMobileNumber().equals(mobileNumber)) {
                return patient;
            }
        }
        return null;
    }

    private static void bookAppointment() {

        List<Doctor> doctors = AdminMenu.getDoctorList();

        if (doctors.isEmpty()) {
            System.out.println("\nNo Doctors Registered.");
            return;
        }

        String mobileNumber = ScannerHelper.readMobileNumber("Enter Patient Mobile Number : ");

        com.clinicops.model.Patient patient = findPatientByMobileNumber(mobileNumber);

        if (patient == null) {
            System.out.println("\nPatient Not Registered.");
            return;
        }

        System.out.println("\nSelect Required Specialization");

        Specialization specialization =
                ScannerHelper.readEnumChoice(
                        "Choose Specialization",
                        Specialization.values()
                );

        String slot = ScannerHelper.readAppointmentSlot();

        Doctor assignedDoctor = doctors.stream()
                .filter(doctor -> doctor.getSpecialization() == specialization)
                .filter(doctor -> doctor.isSlotAvailable(slot))
                .findFirst()
                .orElse(null);

        if (assignedDoctor == null) {
            System.out.println("\nNo Doctor Available for " + specialization + " at " + slot);
            return;
        }

        assignedDoctor.bookSlot(slot);

        Appointment appointment = new Appointment(patient, assignedDoctor, slot);
        appointmentList.add(appointment);

        System.out.println("\nAppointment Booked Successfully.");
        System.out.println(appointment);
    }
}