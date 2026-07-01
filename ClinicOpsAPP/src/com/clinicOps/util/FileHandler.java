package com.clinicOps.util;

import com.clinicOps.model.Doctor;
import com.clinicOps.model.Shift;
import com.clinicOps.model.Specialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private FileHandler() {
    }

    public static List<Doctor> loadDoctors(String filePath, int startingId) {
        List<Doctor> doctors = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int idCounter = startingId;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] data = line.split(",");
                if (data.length != 4) {
                    System.out.println("Invalid Record : " + line);
                    continue;
                }
                try {
                    String doctorId = String.format("D%04d", idCounter++);
                    String name = data[0].trim();
                    Specialization specialization = Specialization.valueOf(data[1].trim().toUpperCase());
                    int experience = Integer.parseInt(data[2].trim());
                    Shift shift = Shift.valueOf(data[3].trim().toUpperCase());
                    doctors.add(new Doctor(doctorId, name, specialization, experience, shift));
                } catch (Exception exception) {
                    System.out.println("Skipping Invalid Record : " + line);
                }
            }
        } catch (IOException exception) {
            System.out.println("Unable to read file : " + exception.getMessage());
        }
        return doctors;
    }
}