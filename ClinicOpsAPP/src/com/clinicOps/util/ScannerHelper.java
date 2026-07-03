package com.clinicOps.util;

import java.util.Scanner;

public class ScannerHelper {

    private static final Scanner SCANNER = new Scanner(System.in);


    private static final String[] APPOINTMENT_SLOTS = {
            "09:00 AM",
            "09:30 AM",
            "10:00 AM",
            "10:30 AM",
            "11:00 AM",
            "11:30 AM",
            "12:00 PM",
            "12:30 PM",

            "04:00 PM",
            "04:30 PM",
            "05:00 PM",
            "05:30 PM",
            "06:00 PM",
            "06:30 PM",
            "07:00 PM",
            "07:30 PM"
    };

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

    public static String readAppointmentSlot() {
        while (true) {
            System.out.println("\nAvailable Appointment Slots");
            for (int i = 0; i < APPOINTMENT_SLOTS.length; i++) {
                System.out.println((i + 1) + ". " + APPOINTMENT_SLOTS[i]);
            }
            int choice = readInteger("\nSelect Slot : ");
            if (choice >= 1 && choice <= APPOINTMENT_SLOTS.length) {
                return APPOINTMENT_SLOTS[choice - 1];
            }
            System.out.println("Invalid Slot Selection.");
        }
    }
}