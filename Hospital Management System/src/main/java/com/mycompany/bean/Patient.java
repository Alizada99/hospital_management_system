/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bean;

/**
 *
 * @author betul
 */
public class Patient extends Human {

    private String illness;
    private String medicalHistory;
    private String emergencyContactInformation;

    public Patient(String name, String surname, int age, String illness, String medicalHistory, String emergencyContactInformation) {
        super(name, surname, age);
        this.illness = illness;
        this.medicalHistory = medicalHistory;
        this.emergencyContactInformation = emergencyContactInformation;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getEmergencyContactInformation() {
        return emergencyContactInformation;
    }

    public void setEmergencyContactInformation(String emergencyContactInformation) {
        this.emergencyContactInformation = emergencyContactInformation;
    }

    @Override
    public String toString() {
        return "name=" + getName() + " surname=" + getSurname() + " age=" + getAge() + " illness=" + getIllness() + " medical history=" + getMedicalHistory() + " emergencyContactInformation=" + getEmergencyContactInformation();
    }

}
