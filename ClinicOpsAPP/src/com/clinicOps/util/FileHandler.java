package com.clinicOps.util;

import com.clinicOps.model.Doctor;
import com.clinicOps.model.Shift;
import com.clinicOps.model.Specialization;
import com.opencsv.CSVReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private static final Logger logger =
            LogManager.getLogger(FileHandler.class);

    private FileHandler() {
    }

    public static List<Doctor> loadDoctors(String path,
                                           int startingId,
                                           List<Doctor> existingDoctors) {

        List<Doctor> doctors = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(path))) {

            String[] row;
            int doctorIdCounter = startingId;

            // Skip CSV Header
            reader.readNext();

            while ((row = reader.readNext()) != null) {

                // Skip blank or invalid rows
                if (row.length < 4) {
                    logger.warn("Skipping Invalid Record");
                    continue;
                }

                try {

                    String name = row[0].trim();

                    Specialization specialization =
                            Specialization.valueOf(row[1].trim().toUpperCase());

                    int experience =
                            Integer.parseInt(row[2].trim());

                    Shift shift =
                            Shift.valueOf(row[3].trim().toUpperCase());

                    // Duplicate Check
                    boolean duplicate = existingDoctors.stream().anyMatch(
                            doctor ->
                                    doctor.getName().equalsIgnoreCase(name)
                                            && doctor.getSpecialization() == specialization
                                            && doctor.getExperience() == experience
                    );

                    if (duplicate) {
                        logger.warn("Duplicate Doctor Skipped : {}", name);
                        continue;
                    }

                    String doctorId =
                            String.format("D%04d", doctorIdCounter++);

                    Doctor doctor = new Doctor(
                            doctorId,
                            name,
                            specialization,
                            experience,
                            shift
                    );

                    doctors.add(doctor);

                } catch (IllegalArgumentException e) {
                    logger.warn("Invalid Record : {}", String.join(",", row));
                }
            }

            logger.info("{} Doctors Imported Successfully", doctors.size());

        } catch (Exception e) {
            logger.error("CSV Read Failed", e);
        }

        return doctors;
    }
}