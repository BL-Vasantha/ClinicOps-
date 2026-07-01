package com.clinicOps.util;

import java.util.Scanner;

public class ScannerHelper {

    private static final Scanner SCANNER = new Scanner(System.in);

    private ScannerHelper() {
    }

    public static String readString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty. Please try again.");
        }
    }

    public static int readInteger(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static <T extends Enum<T>> T readEnumChoice(
            String prompt,
            T[] values) {
        while (true) {
            System.out.println(prompt);
            for (int i = 0; i < values.length; i++) {
                System.out.println((i + 1) + ". " + values[i]);
            }
            int choice = readInteger("Enter Choice : ");
            if (choice >= 1 && choice <= values.length) {
                return values[choice - 1];
            }
            System.out.println("Invalid Choice.");
        }
    }

    public static String readMobileNumber(String prompt) {
        while (true) {
            System.out.print(prompt);
            String mobile = SCANNER.nextLine().trim();
            if (mobile.matches("^[6-9]\\d{9}$")) {
                return mobile;
            }
            System.out.println("Invalid Indian Mobile Number.");
        }
    }
}