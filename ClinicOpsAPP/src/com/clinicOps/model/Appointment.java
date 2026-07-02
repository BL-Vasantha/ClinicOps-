package com.clinicOps.model;

public class Appointment {

    private com.clinicops.model.Patient patient;
    private Doctor doctor;
    private String slot;

    public Appointment(com.clinicops.model.Patient patient, Doctor doctor, String slot) {
        this.patient = patient;
        this.doctor = doctor;
        this.slot = slot;
    }

    public com.clinicops.model.Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getSlot() {
        return slot;
    }

    @Override
    public String toString() {
        return "\n=========== Appointment ===========" +
                "\nPatient ID      : " + patient.getPatientId() +
                "\nPatient Name    : " + patient.getName() +
                "\nDoctor ID       : " + doctor.getId() +
                "\nDoctor Name     : " + doctor.getName() +
                "\nAppointment Slot: " + slot +
                "\n===================================";
    }
}