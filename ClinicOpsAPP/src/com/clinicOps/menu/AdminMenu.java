package com.clinicOps.menu;

import com.clinicOps.model.Doctor;
import com.clinicOps.util.ScannerHelper;
import com.clinicOps.model.Shift;
import com.clinicOps.model.Specialization;
import com.clinicOps.util.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class AdminMenu {

    private static final ArrayList<Doctor> doctorList = new ArrayList<>();
    private static int doctorIdCounter = 1;

    private AdminMenu() {
    }

    public static void showMenu() {
        boolean logout = false;
        while (!logout) {
            displayAdminOptions();
            int choice = ScannerHelper.readInteger("\nEnter your choice: ");
            switch (choice) {
                case 1:
                    registerDoctors();
                    break;
                case 2:
                    bulkImportDoctors();
                    break;
                case 3:
                    System.out.println("\nAudit Log feature will be implemented in upcoming use cases.");
                    break;
                case 4:
                    displayDoctors();
                    break;
                case 5:
                    System.out.println("\nLogging out from Clinic Admin...");
                    logout = true;
                    break;
                default:
                    System.out.println("\nInvalid option. Please enter between 1 and 5.");
            }
        }
    }

    private static void displayAdminOptions() {
        System.out.println("----- CLINIC ADMIN MENU -----");

        System.out.println("1. Doctor Data Entry");
        System.out.println("2. Bulk Data Entry");
        System.out.println("3. View Audit Logs");
        System.out.println("4. Display Doctors");
        System.out.println("5. Logout");
    }

    private static void registerDoctors() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEnter Doctor " + i + " Details");
            String doctorId = String.format("D%04d", doctorIdCounter++);
            String name = ScannerHelper.readString("Doctor Name : ");
            Specialization specialization = ScannerHelper.readEnumChoice("\nSelect Specialization",
                    Specialization.values());
            int experience = ScannerHelper.readInteger("Experience : ");
            Shift shift = ScannerHelper.readEnumChoice("\nSelect Shift",
                    Shift.values());
            Doctor doctor = new Doctor(doctorId, name, specialization, experience, shift);
            doctorList.add(doctor);
        }
        System.out.println("\nDoctors Registered Successfully.");
    }

    private static void displayDoctors() {
        if (doctorList.isEmpty()) {
            System.out.println("\nNo Doctors Registered.");
            return;
        }
        System.out.println("\n============== Doctor List ==============");
        for (Doctor doctor : doctorList) {
            System.out.println(doctor);
            System.out.println("-----------------------------------------");
        }
    }

    private static void bulkImportDoctors() {
        String filePath = ScannerHelper.readString("Enter CSV File Path : ");
        List<Doctor> importedDoctors = FileHandler.loadDoctors(filePath, doctorIdCounter, doctorList);
        doctorList.addAll(importedDoctors);
        doctorIdCounter += importedDoctors.size();
        System.out.println(importedDoctors.size() + " Doctors Imported Successfully.");
    }
}