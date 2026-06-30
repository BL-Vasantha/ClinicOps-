package com.clinicOps.util;

import java.util.Scanner;

public class ScannerHelper {

    private ScannerHelper() {
        // Private constructor (utility class)
    }

    public static int readIntegerInput(Scanner scanner) {
        try {
            int input = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            return input;
        } catch (Exception e) {
            scanner.nextLine(); // clear invalid input
            System.out.println(">> Error: Please enter a valid number.");
            return -1;
        }
    }
}