package com.clinicOps;

import java.util.Scanner;
import com.clinicOps.menu.AdminMenu;
import com.clinicOps.menu.FrontDeskMenu;
import com.clinicOps.util.ScannerHelper;

public class ClinicApp {

    private static final int ROLE_ADMIN = 1;
    private static final int ROLE_FRONT_DESK = 2;
    private static final int EXIT_SYSTEM = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exitSystem = false;

        System.out.println("*** Welcome to ClinicOps App ***");

        while (!exitSystem) {

            System.out.println("\n--- MAIN MENU ---");
            System.out.println("Select Persona:");
            System.out.println("1. Admin");
            System.out.println("2. Front Desk Executive");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int roleChoice = ScannerHelper.readIntegerInput(scanner);

            switch (roleChoice) {
                case ROLE_ADMIN:
                    AdminMenu.show(scanner);
                    break;

                case ROLE_FRONT_DESK:
                    FrontDeskMenu.show(scanner);
                    break;

                case EXIT_SYSTEM:
                    exitSystem = true;
                    System.out.println("Shutting down ClinicOps App... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1, 2 or 3.");
            }
        }

        scanner.close();
    }
}