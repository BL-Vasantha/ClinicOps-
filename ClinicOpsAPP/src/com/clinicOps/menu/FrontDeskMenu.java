package com.clinicOps.menu;

import com.clinicOps.model.*;
import com.clinicOps.util.ScannerHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

public class FrontDeskMenu {

    private static final Logger logger =
            LogManager.getLogger(FrontDeskMenu.class);

    private static final List<Patient> patientList = new ArrayList<>();
    private static final List<Appointment> appointmentList = new ArrayList<>();
    private static int patientIdCounter = 1;

    public static void showMenu() {
        while (true) {
            System.out.println("1.Register 2.Book 3.Exit");
            int choice = ScannerHelper.readInteger("Enter choice: ");

            switch (choice) {
                case 1 -> registerPatient();
                case 2 -> bookAppointment();
                case 3 -> {
                    logger.info("Front Desk Logout");
                    return;
                }
            }
        }
    }

    private static void registerPatient() {
        String mobile = ScannerHelper.readMobileNumber("Mobile: ");

        for (Patient p : patientList) {
            if (p.getMobileNumber().equals(mobile)) {
                logger.warn("Duplicate Patient: {}", mobile);
                System.out.println("Already Registered");
                return;
            }
        }

        Patient p = new Patient(
                "P" + patientIdCounter++,
                ScannerHelper.readString("Name: "),
                ScannerHelper.readString("Gender: "),
                ScannerHelper.readInteger("Age: "),
                mobile
        );

        patientList.add(p);
        logger.info("Patient Registered: {}", p.getName());
    }

    private static void bookAppointment() {
        List<Doctor> doctors = AdminMenu.getDoctorList();

        String mobile = ScannerHelper.readMobileNumber("Mobile: ");
        Patient patient = patientList.stream()
                .filter(p -> p.getMobileNumber().equals(mobile))
                .findFirst().orElse(null);

        if (patient == null) {
            logger.error("Patient not found");
            return;
        }

        Specialization spec = ScannerHelper.readEnumChoice("Spec", Specialization.values());
        String slot = ScannerHelper.readAppointmentSlot();

        Doctor doctor = doctors.stream()
                .filter(d -> d.getSpecialization() == spec)
                .filter(d -> d.isShiftCompatible(slot))
                .filter(d -> d.isSlotAvailable(slot))
                .findFirst().orElse(null);

        if (doctor == null) {
            logger.warn("No doctor available");
            return;
        }

        doctor.bookSlot(slot);
        Appointment appt = new Appointment(patient, doctor, slot);
        appointmentList.add(appt);

        logger.info("Appointment Booked: {} with {} at {}",
                patient.getName(), doctor.getName(), slot);

        System.out.println(appt);
    }
}