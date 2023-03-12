/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Appointment;
import com.mycompany.service.inter.MenuCancelAppointmentServiceInter;
import com.mycompany.util.InputUtil;
import java.util.ArrayList;

/**
 *
 * @author betul
 */
public class MenuCancelAppointmentService implements MenuCancelAppointmentServiceInter {

    @Override
    public void process() {
        String appointmentDate = InputUtil.requireText("Enter appointment date (YYYY-MM-DD) ");
        ArrayList<Appointment> appointments = Appointment.getAppointments();
        for (int i = 0; i < appointments.size(); i++) {
            Appointment ap = appointments.get(i);
            if (ap.getAppointmentDate().equals(appointmentDate)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled successfully!");
                return;
            }
        }
        System.out.println("Appointment is not found!");
    }
}
