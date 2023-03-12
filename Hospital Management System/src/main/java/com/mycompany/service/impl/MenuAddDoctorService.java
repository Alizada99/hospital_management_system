/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Doctor;
import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuAddDoctorServiceInter;
import com.mycompany.util.InputUtil;

/**
 *
 * @author betul
 */
public class MenuAddDoctorService implements MenuAddDoctorServiceInter {

    @Override
    public void process() {
        if (!Config.isLoggedIn()) {
            throw new IllegalStateException("You must log in  before accessing this menu item!!!");
        }
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        int age = InputUtil.requireNumber("Enter age");
        String speciality = InputUtil.requireText("Enter speciality");
        int experience = InputUtil.requireNumber("Enter experience");
        String availability = InputUtil.requireText("Enter availability");
        String patientReviews = InputUtil.requireText("Enter patient reviews");

        Doctor dc = new Doctor(name, surname, age, speciality, experience, availability, patientReviews);

        Config c = new Config();
        Config.instance().setDoctors(dc);

        Config.save();
    }
}
