/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.bean.Appointment;
import com.mycompany.service.inter.MenuViewAppointmentServiceInter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author betul
 */
public class MenuViewAppointmentService implements MenuViewAppointmentServiceInter {

    @Override
    public void process() {
        ArrayList<Appointment> appointments = Appointment.getAppointments();
        if (appointments.isEmpty()) {
            System.out.println("No appointments is found!");
            return;
        }
        System.out.println("Appointments: ");
        for (Appointment ap : appointments) {
            System.out.println("Patient name: " + ap.getPatientName());
            System.out.println("Doctor name: " + ap.getDoctorName());
            System.out.println("Appointment date: " + ap.getAppointmentDate());
        }
    }

}
