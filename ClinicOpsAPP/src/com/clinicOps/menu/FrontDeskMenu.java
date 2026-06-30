package com.clinicOps.menu;

import com.clinicOps.util.ScannerHelper;

import java.util.Scanner;

public class FrontDeskMenu {

    private static final int PATIENT_REGISTRATION = 1;
    private static final int BOOK_APPOINTMENT = 2;
    private static final int LOGOUT = 3;

    public static void show(Scanner scanner) {

        boolean logout = false;

        while (!logout) {

            System.out.println("\n--- FRONT DESK EXECUTIVE MENU ---");
            System.out.println("1. Register New Patient");
            System.out.println("2. Book Appointment");
            System.out.println("3. Logout");
            System.out.print("Enter choice: ");

            int choice = ScannerHelper.readIntegerInput(scanner);

            switch (choice) {
                case PATIENT_REGISTRATION:
                    System.out.println("[Logic for Patient Registration will be implemented]");
                    break;

                case BOOK_APPOINTMENT:
                    System.out.println("[Logic for Appointment Booking will be implemented]");
                    break;

                case LOGOUT:
                    logout = true;
                    System.out.println("Logging out Front Desk Executive...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}