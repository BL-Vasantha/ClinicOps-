package com.clinicOps.util;

import java.util.Scanner;

public class ScannerHelper {

    public static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return readInt(scanner);
    }

    public static String readString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); // clear buffer
        return scanner.nextLine();
    }

    // 🔥 Generic Enum Reader (UC4 Key Feature)
    public static <T extends Enum<T>> T readEnumChoice(Scanner scanner, T[] values) {

        while (true) {
            for (int i = 0; i < values.length; i++) {
                System.out.println((i + 1) + ". " + values[i]);
            }

            int choice = readInt(scanner, "Select choice (Number): ");

            if (choice >= 1 && choice <= values.length) {
                return values[choice - 1];
            }

            System.out.println(">> Invalid choice. Try again.");
        }
    }
}