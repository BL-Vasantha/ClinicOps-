package com.clinicOps;

import com.clinicOps.menu.AdminMenu;
import com.clinicOps.menu.FrontDeskMenu;
import com.clinicOps.util.ScannerHelper;

public class ClinicApp {


    private static final int ROLE_ADMIN = 1;
    private static final int ROLE_FRONT_DESK = 2;
    private static final int EXIT_SYSTEM = 3;

    public static void main(String[] args) {

        boolean exitSystem = false;
        while (!exitSystem) {
            System.out.println("******* Welcome to TownClinic *******");
            System.out.println("\n-----******* MAIN MENU *******-----");
            System.out.println("1. Clinic Admin");
            System.out.println("2. Front Desk Executive");
            System.out.println("3. Exit");

            int choice = ScannerHelper.readInteger("\nEnter your choice: ");
            switch (choice) {
                case ROLE_ADMIN:
                    AdminMenu.showMenu();
                    break;
                case ROLE_FRONT_DESK:
                    FrontDeskMenu.showMenu();
                    break;
                case EXIT_SYSTEM:
                    System.out.println("\nThank you for using ClinicOps. Goodbye!");
                    exitSystem = true;
                    break;
                default:
                    System.out.println("\nInvalid choice. Please enter 1, 2 or 3.");
            }
        }
    }
}