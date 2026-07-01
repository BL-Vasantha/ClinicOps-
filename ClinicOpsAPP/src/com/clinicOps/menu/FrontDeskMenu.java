package com.clinicOps.menu;

import com.clinicOps.util.ScannerHelper;

public class FrontDeskMenu {

    private static final int PATIENT_REGISTRATION = 1;
    private static final int BOOK_APPOINTMENT = 2;
    private static final int LOGOUT = 3;

    private FrontDeskMenu() {
    }

    public static void showMenu() {
        boolean logout = false;
        while (!logout) {
            displayFrontDeskOptions();
            int choice = ScannerHelper.readInteger("\nEnter your choice: ");
            switch (choice) {
                case PATIENT_REGISTRATION:
                    System.out.println("\n[Placeholder] Patient Registration functionality will be implemented in future UC.");
                    break;
                case BOOK_APPOINTMENT:
                    System.out.println("\n[Placeholder] Appointment Booking functionality will be implemented in future UC.");
                    break;
                case LOGOUT:
                    System.out.println("\nLogging out from Front Desk Executive...");
                    logout = true;
                    break;
                default:
                    System.out.println("\nInvalid option. Please enter between 1 and 3.");
            }
        }
    }

    private static void displayFrontDeskOptions() {
        System.out.println("----- FRONT DESK EXECUTIVE MENU -----");

        System.out.println("1. Patient Registration");
        System.out.println("2. Book Appointment");
        System.out.println("3. Logout");
    }
}