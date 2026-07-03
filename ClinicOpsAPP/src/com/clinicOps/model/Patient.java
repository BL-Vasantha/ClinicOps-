package com.clinicOps.model;

public class Patient
{

    private String patientId;
    private String name;
    private String gender;
    private int age;
    private String mobileNumber;

    public Patient(String patientId,
                   String name,
                   String gender,
                   int age,
                   String mobileNumber) {

        this.patientId = patientId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {

        return "Patient ID    : " + patientId +
                "\nName         : " + name +
                "\nGender       : " + gender +
                "\nAge          : " + age +
                "\nMobile No    : " + mobileNumber;
    }
}