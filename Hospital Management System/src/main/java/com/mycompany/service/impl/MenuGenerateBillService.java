/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Patient;
import com.mycompany.config.Config;
import com.mycompany.service.inter.MenuGenerateBillServiceInter;
import com.mycompany.util.InputUtil;

/**
 *
 * @author betul
 */
public class MenuGenerateBillService implements MenuGenerateBillServiceInter {

    @Override
    public void process() {
        String patientName = InputUtil.requireText("Enter patient name");
        int days = InputUtil.requireNumber("Enter number of days of hospitalization");
        double ratePerDay = InputUtil.requireDNumber("Enter rate per day");

        Patient patient = null;
        for (Patient p : Config.instance().getPatients()) {
            if (p.getName().equals(patientName)) {
                patient = p;
            }
        }
        if (patient == null) {
            System.out.println("Patient with name " + patientName + " is not found!");
        }
        double amount = days * ratePerDay;
        double tax = amount * 0.05;
        double totalAmount = amount + tax;
        System.out.println("The amount is " + amount
                + "\nThe tax is " + tax
                + "\nThe total amount you will pay is " + totalAmount);

    }
}
