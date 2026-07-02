package com.clinicOps.model;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private String id;
    private String name;
    private Specialization specialization;
    private int experience;
    private Shift shift;
    private List<String> bookedSlots = new ArrayList<>();

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

    public List<String> getBookedSlots() {
        return bookedSlots;
    }

    public boolean isSlotAvailable(String slot) {
        return !bookedSlots.contains(slot);
    }

    public void bookSlot(String slot) {
        bookedSlots.add(slot);
    }

    @Override
    public String toString() {

        return "Doctor ID      : " + id +
                "\nName          : " + name +
                "\nSpecialization: " + specialization +
                "\nExperience    : " + experience + " Years" +
                "\nShift         : " + shift +
                "\nBooked Slots  : " + bookedSlots;
    }
}