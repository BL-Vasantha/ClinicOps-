package com.clinicOps.menu;

import com.clinicOps.util.ScannerHelper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class AdminMenu {

    private static final int DOCTOR_ENTRY = 1;
    private static final int BULK_ENTRY = 2;
    private static final int VIEW_AUDIT = 3;
    private static final int DISPLAY_DOCTORS = 4;
    private static final int LOGOUT = 5;

    // Manual Doctors
    private static String doc1Name="", doc1Spec="", doc1Shift="";
    private static int doc1Exp=0;

    private static String doc2Name="", doc2Spec="", doc2Shift="";
    private static int doc2Exp=0;

    private static String doc3Name="", doc3Spec="", doc3Shift="";
    private static int doc3Exp=0;

    // CSV Doctors
    private static String csvDoc1Name="", csvDoc1Spec="", csvDoc1Shift="";
    private static int csvDoc1Exp=0;

    private static String csvDoc2Name="", csvDoc2Spec="", csvDoc2Shift="";
    private static int csvDoc2Exp=0;

    private static String csvDoc3Name="", csvDoc3Spec="", csvDoc3Shift="";
    private static int csvDoc3Exp=0;

    public static void show(Scanner scanner) {

        boolean logout = false;

        while (!logout) {

            displayAdminOptions();

            int choice =
                    ScannerHelper.readIntWithPrompt(
                            scanner,
                            "Enter choice: "
                    );

            switch (choice) {

                case DOCTOR_ENTRY:
                    registerDoctors(scanner);
                    break;

                case BULK_ENTRY:
                    importDoctorsFromCSV();
                    break;

                case VIEW_AUDIT:
                    System.out.println(
                            "[Audit log logic will be implemented]"
                    );
                    break;

                case DISPLAY_DOCTORS:
                    displayDoctors();
                    break;

                case LOGOUT:
                    logout = true;
                    System.out.println(
                            "Logging out Admin..."
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice!"
                    );

            }

        }

    }

    private static void displayAdminOptions() {

        System.out.println("\n--- CLINIC ADMIN MENU ---");

        System.out.println("1. Doctors' Entry");
        System.out.println("2. Bulk Entry (CSV)");
        System.out.println("3. View Audit Logs");
        System.out.println("4. Display All Doctors");
        System.out.println("5. Logout");

    }

    private static void registerDoctors(
            Scanner scanner
    ) {

        System.out.println("\n--- Enter Doctor Details ---");

        System.out.println("\nDoctor 1");

        doc1Name =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Name: "
                );

        doc1Spec =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Specialization: "
                );

        doc1Exp =
                ScannerHelper.readIntWithPrompt(
                        scanner,
                        "Experience: "
                );

        doc1Shift =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Shift: "
                );

        System.out.println("\nDoctor 2");

        doc2Name =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Name: "
                );

        doc2Spec =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Specialization: "
                );

        doc2Exp =
                ScannerHelper.readIntWithPrompt(
                        scanner,
                        "Experience: "
                );

        doc2Shift =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Shift: "
                );

        System.out.println("\nDoctor 3");

        doc3Name =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Name: "
                );

        doc3Spec =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Specialization: "
                );

        doc3Exp =
                ScannerHelper.readIntWithPrompt(
                        scanner,
                        "Experience: "
                );

        doc3Shift =
                ScannerHelper.readStringWithPrompt(
                        scanner,
                        "Shift: "
                );

        System.out.println(
                "\nDoctors registered successfully!"
        );

    }

    private static void importDoctorsFromCSV() {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(
                                    "ClinicOpsApp/doctors.csv"
                            )
                    );

            String line;

            int count = 0;

            while ((line = reader.readLine()) != null) {

                line =
                        line.trim();

                if (
                        line.isEmpty()
                ) {
                    continue;
                }

                String[] doctor =
                        line.split(",");

                if (
                        doctor.length != 4
                ) {
                    continue;
                }

                count++;

                if (count == 1) {

                    csvDoc1Name = doctor[0].trim();
                    csvDoc1Spec = doctor[1].trim();
                    csvDoc1Exp =
                            Integer.parseInt(
                                    doctor[2].trim()
                            );
                    csvDoc1Shift =
                            doctor[3].trim();

                }

                else if (count == 2) {

                    csvDoc2Name = doctor[0].trim();
                    csvDoc2Spec = doctor[1].trim();
                    csvDoc2Exp =
                            Integer.parseInt(
                                    doctor[2].trim()
                            );
                    csvDoc2Shift =
                            doctor[3].trim();

                }

                else if (count == 3) {

                    csvDoc3Name = doctor[0].trim();
                    csvDoc3Spec = doctor[1].trim();
                    csvDoc3Exp =
                            Integer.parseInt(
                                    doctor[2].trim()
                            );
                    csvDoc3Shift =
                            doctor[3].trim();

                }

            }

            reader.close();

            System.out.println(
                    "\nDoctors imported successfully from CSV!"
            );

        }

        catch (Exception e) {

            System.out.println(
                    "CSV import failed: "
                            + e.getMessage()
            );

        }

    }

    private static void displayDoctors() {

        System.out.println(
                "\n--- REGISTERED DOCTORS ---"
        );

        if (!doc1Name.isEmpty())
            System.out.println("ID:D001 | " + doc1Name + " | " + doc1Spec + " | " + doc1Exp + " | " + doc1Shift);

        if (!doc2Name.isEmpty())
            System.out.println("ID:D002 | " + doc2Name + " | " + doc2Spec + " | " + doc2Exp + " | " + doc2Shift);

        if (!doc3Name.isEmpty())
            System.out.println("ID:D003 | " + doc3Name + " | " + doc3Spec + " | " + doc3Exp + " | " + doc3Shift);

        if (!csvDoc1Name.isEmpty())
            System.out.println("CSV-D001 | " + csvDoc1Name + " | " + csvDoc1Spec + " | " + csvDoc1Exp + " | " + csvDoc1Shift);

        if (!csvDoc2Name.isEmpty())
            System.out.println("CSV-D002 | " + csvDoc2Name + " | " + csvDoc2Spec + " | " + csvDoc2Exp + " | " + csvDoc2Shift);

        if (!csvDoc3Name.isEmpty())
            System.out.println("CSV-D003 | " + csvDoc3Name + " | " + csvDoc3Spec + " | " + csvDoc3Exp + " | " + csvDoc3Shift);

    }

}