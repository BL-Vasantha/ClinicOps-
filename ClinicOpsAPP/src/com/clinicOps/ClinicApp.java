package com.clinicOps;
import com.clinicOps.menu.AdminMenu;
import com.clinicOps.util.ScannerHelper;

import java.util.Scanner;

public class ClinicApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("*** Welcome to ClinicOps ***");

        while (!exit) {

            System.out.println("\n1. Admin");
            System.out.println("2. Exit");

            int choice = ScannerHelper.readInt(scanner, "Enter choice: ");

            switch (choice) {

                case 1:
                    AdminMenu.show(scanner);
                    break;

                case 2:
                    exit = true;
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}