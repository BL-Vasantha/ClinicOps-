package com.clinicOps.model;

public class Doctor {

    private String id;
    private String name;
    private Specialization specialization;
    private int experience;
    private Shift shift;

    public Doctor(String id, String name, Specialization specialization, int experience, Shift shift) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.shift = shift;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %-5s | Name: %-15s | Specialization: %-20s | Exp: %2d yrs | Shift: %s",
                id, name, specialization, experience, shift
        );
    }
}