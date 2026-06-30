package com.clinicOps.menu;

import com.clinicOps.model.Doctor;
import com.clinicOps.util.ScannerHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminMenu {

    private static final List<Doctor> doctorList = new ArrayList<>();
    private static int idCounter = 1;

    public static void show(Scanner scanner) {

        boolean logout = false;

        while (!logout) {

            System.out.println("\n--- ADMIN MENU ---");
            System.out.println("1. Register Doctor");
            System.out.println("2. Display Doctors");
            System.out.println("3. Logout");
            System.out.print("Enter choice: ");

            int choice = ScannerHelper.readInt(scanner);

            switch (choice) {

                case 1:
                    registerDoctor(scanner);
                    break;

                case 2:
                    displayDoctors();
                    break;

                case 3:
                    logout = true;
                    System.out.println("Logging out...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void registerDoctor(Scanner scanner) {

        System.out.println("\n--- Registering New Doctor ---");

        String id = String.format("D%04d", idCounter++);

        String name =
                ScannerHelper.readString(
                        scanner,
                        "Name: "
                );

        String specialization =
                ScannerHelper.readString(
                        scanner,
                        "Specialization: "
                );

        int experience =
                ScannerHelper.readInt(
                        scanner,
                        "Experience: "
                );

        String shift =
                ScannerHelper.readString(
                        scanner,
                        "Shift: "
                );

        Doctor doctor =
                new Doctor(
                        id,
                        name,
                        specialization,
                        experience,
                        shift
                );

        doctorList.add(doctor);

        System.out.println(
                "Doctor registered successfully with ID: "
                        + id
        );
    }

    private static void displayDoctors() {

        System.out.println("\n--- Doctor List ---");

        if (doctorList.isEmpty()) {

            System.out.println(
                    "No doctors available."
            );

            return;
        }

        for (Doctor doctor : doctorList) {

            System.out.println(
                    doctor
            );

        }
    }
}