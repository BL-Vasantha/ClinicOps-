package com.clinicOps.menu;

import com.clinicOps.util.ScannerHelper;
import java.util.Scanner;

public class AdminMenu {

    private static final int DOCTOR_ENTRY = 1;
    private static final int BULK_ENTRY = 2;
    private static final int VIEW_AUDIT = 3;
    private static final int LOGOUT = 4;

    public static void show(Scanner scanner) {

        boolean logout = false;

        while (!logout) {

            System.out.println("\n--- CLINIC ADMIN MENU ---");

            System.out.println("1. Doctors' Entry");
            System.out.println("2. Bulk Entry (CSV)");
            System.out.println("3. View Audit Logs");
            System.out.println("4. Logout");

            System.out.print("Enter choice: ");

            int choice =
                    ScannerHelper.readIntegerInput(scanner);

            switch (choice) {

                case DOCTOR_ENTRY:
                    System.out.println(
                            "[Logic for Doctor Entry will be implemented]"
                    );
                    break;

                case BULK_ENTRY:
                    System.out.println(
                            "[Logic for Bulk CSV Upload will be implemented]"
                    );
                    break;

                case VIEW_AUDIT:
                    System.out.println(
                            "[Logic for Audit Logs will be implemented]"
                    );
                    break;

                case LOGOUT:
                    logout = true;
                    System.out.println(
                            "Logging out Admin..."
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice! Please try again."
                    );
            }
        }
    }
}