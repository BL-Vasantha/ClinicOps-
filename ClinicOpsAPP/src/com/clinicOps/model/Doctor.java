package com.clinicOps.model;

import com.clinicOps.model.Shift;
import com.clinicOps.model.Specialization;

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
        return id + " | " + name + " | " + specialization + " | " + experience + " | " + shift;
    }
}