/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.config;

import com.mycompany.bean.Doctor;
import com.mycompany.bean.Patient;
import com.mycompany.util.FileUtility;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author betul
 */
public class Config implements Serializable {

    public static Config instance() {
        if (config == null) {
            return new Config();
        }
        return config;
    }

    public static void save() {
        FileUtility.writeObjectToFile(Config.instance(), "ms.obj");
    }

    public static void initialize() {
        Object obj = FileUtility.readObjectFromFile("ms.obj");
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    public static Config config = null;
    private static boolean LoggedIn;

    public static boolean isLoggedIn() {
        return LoggedIn;
    }

    public static void setLoggedIn(boolean LoggedIn) {
        Config.LoggedIn = LoggedIn;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients.add(patients);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor doctors) {
        this.doctors.add(doctors);
    }

}
