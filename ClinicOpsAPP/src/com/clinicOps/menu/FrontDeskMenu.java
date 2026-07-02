package com.clinicOps.menu;



import com.clinicOps.model.Patient;
import com.clinicOps.util.ScannerHelper;

import java.util.ArrayList;

public class FrontDeskMenu {

    private static final ArrayList<Patient> patientList = new ArrayList<>();
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
                    System.out.println("\nAppointment Booking will be implemented in future UC.");
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
        Patient existingPatient = findPatientByMobileNumber(mobileNumber);
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
        Patient patient = new Patient(patientId, name, gender, age, mobileNumber);
        patientList.add(patient);
        System.out.println("\nPatient Registered Successfully.");
    }

    private static void viewPatients() {
        if (patientList.isEmpty()) {
            System.out.println("\nNo Patients Registered.");
            return;
        }
        System.out.println("\n========== Patient List ==========");
        for (Patient patient : patientList) {
            System.out.println(patient);
            System.out.println("----------------------------------");
        }
    }

    private static Patient findPatientByMobileNumber(String mobileNumber) {
        for (Patient patient : patientList) {
            if (patient.getMobileNumber().equals(mobileNumber)) {
                return patient;
            }
        }
        return null;
    }
}