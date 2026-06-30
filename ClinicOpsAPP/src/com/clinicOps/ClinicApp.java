package com.clinicOps;


import com.clinicOps.menu.AdminMenu;

import java.util.Scanner;

public class ClinicApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("*** Welcome to ClinicOps ***");

        while (!exit) {
            System.out.println("\n1. Admin");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AdminMenu.show(scanner);
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}