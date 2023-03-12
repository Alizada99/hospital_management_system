/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bean;

/**
 *
 * @author betul
 */
public class Doctor extends Human {

    private String specialty;
    private int experience;
    private String availability;
    private String patientReviews;

    public Doctor(String name, String surname, int age, String specialty, int experience, String availability, String patientReviews) {
        super(name, surname, age);
        this.specialty = specialty;
        this.experience = experience;
        this.availability = availability;
        this.patientReviews = patientReviews;

    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availabilty) {
        this.availability = availabilty;
    }

    public String getPatientReviews() {
        return patientReviews;
    }

    public void setPatientReviews(String patientReviews) {
        this.patientReviews = patientReviews;
    }

    @Override
    public String toString() {
        return "name=" + getName() + " surname=" + getSurname() + " age=" + getAge() + " specialty=" + getSpecialty() + " experience=" + getExperience() + " availability=" + getAvailability() + " patientReviews=" + getPatientReviews();
    }

}
