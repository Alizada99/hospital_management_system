/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Appointment;
import com.mycompany.service.inter.MenuBookAppointmentServiceInter;
import com.mycompany.util.InputUtil;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author betul
 */
public class MenuBookAppointmentService implements MenuBookAppointmentServiceInter {

    @Override
    public void process() {
        String patientName = InputUtil.requireText("Enter patient name");
        String doctorName = InputUtil.requireText("Enter doctor name");
        String appointmentDate = InputUtil.requireText("Enter appointment date (YYYY-MM-DD)");
        Appointment ap = new Appointment(patientName, doctorName, appointmentDate);
        Appointment.getAppointments().add(ap);

    }
}
