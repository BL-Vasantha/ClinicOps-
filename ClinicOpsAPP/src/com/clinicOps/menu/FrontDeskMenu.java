package com.clinicOps.menu;

import com.clinicOps.util.ScannerHelper;

import java.util.Scanner;

public class FrontDeskMenu {

    private static final int REGISTER_PATIENT = 1;
    private static final int BOOK_APPOINTMENT = 2;
    private static final int LOGOUT = 3;

    public static void show(Scanner scanner) {

        boolean logout = false;

        while (!logout) {

            System.out.println("\n--- FRONT DESK EXECUTIVE MENU ---");
            System.out.println("1. Register New Patient");
            System.out.println("2. Book Appointment");
            System.out.println("3. Logout");

            int choice = ScannerHelper.readInt(scanner, "Enter choice: ");

            switch (choice) {

                case REGISTER_PATIENT:
                    System.out.println("[Patient registration logic coming soon]");
                    break;

                case BOOK_APPOINTMENT:
                    System.out.println("[Appointment booking logic coming soon]");
                    break;

                case LOGOUT:
                    logout = true;
                    System.out.println("Logging out Front Desk Executive...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}