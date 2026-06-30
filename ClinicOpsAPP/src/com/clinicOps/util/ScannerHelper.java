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
}