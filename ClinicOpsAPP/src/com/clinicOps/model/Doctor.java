package com.clinicOps.model;

public class Doctor {

    private String id;
    private String name;
    private Specialization specialization;
    private int experience;
    private Shift shift;


    public Doctor(String id,
                  String name,
                  Specialization specialization,
                  int experience,
                  Shift shift) {

        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.shift = shift;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    public Shift getShift() {
        return shift;
    }

    @Override
    public String toString() {
        return "Doctor ID      : " + id +
                "\nName          : " + name +
                "\nSpecialization: " + specialization +
                "\nExperience    : " + experience + " Years" +
                "\nShift         : " + shift;
    }
}