/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Doctor;
import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuViewDoctorRecordServiceInter;
import java.util.ArrayList;

/**
 *
 * @author betul
 */
public class MenuViewDoctorRecordService implements MenuViewDoctorRecordServiceInter {

    @Override
    public void process() {
        if (!Config.isLoggedIn()) {
            throw new IllegalStateException("You must log in  before accessing this menu item!!!");
        }
        ArrayList<Doctor> st = Config.instance().getDoctors();

        for (Doctor s : st) {
            System.out.println(s);
        }
    }

}
