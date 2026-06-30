package com.clinicOps.util;

import java.util.Scanner;

public class ScannerHelper {

    private ScannerHelper() {}

    // Integer input with validation
    public static int readIntWithPrompt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                scanner.nextLine(); // clear buffer
                return value;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(">> Error: Please enter a valid number.");
            }
        }
    }

    // Non-empty string input
    public static String readStringWithPrompt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(">> Error: Input cannot be empty.");
        }

    }
}