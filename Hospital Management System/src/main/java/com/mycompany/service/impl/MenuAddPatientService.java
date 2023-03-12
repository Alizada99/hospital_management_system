/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Patient;
import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuAddPatientServiceInter;
import com.mycompany.util.InputUtil;

/**
 *
 * @author betul
 */
public class MenuAddPatientService implements MenuAddPatientServiceInter{

    @Override
    public void process() {
        if (!Config.isLoggedIn()){
            throw new IllegalStateException("You must log in  before accessing this menu item!!!");
        }
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        int age = InputUtil.requireNumber("Enter age");
        String illness = InputUtil.requireText("Enter illness");
        String medicalHistory = InputUtil.requireText("Enter medical history");
        String emergencyContactInformation = InputUtil.requireText("Enter emergency contact information");
        Patient pt = new Patient(name, surname, age, illness, medicalHistory, emergencyContactInformation);

        Config c = new Config();
        Config.instance().setPatients(pt);

        Config.save();
    }

}
    

