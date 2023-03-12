/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.util;

import com.mycompany.service.impl.MenuAddDoctorService;
import com.mycompany.service.impl.MenuAddPatientService;
import com.mycompany.service.impl.MenuBookAppointmentService;
import com.mycompany.service.impl.MenuCancelAppointmentService;
import com.mycompany.service.impl.MenuExitService;
import com.mycompany.service.impl.MenuGenerateBillService;
import com.mycompany.service.impl.MenuLoginService;
import com.mycompany.service.impl.MenuViewAppointmentService;
import com.mycompany.service.impl.MenuViewDoctorRecordService;
import com.mycompany.service.impl.MenuViewPatientRecordService;
import com.mycompany.service.inter.MenuService;

/**
 *
 * @author betul
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    VIEW_PATIENT_RECORDS(2, "View patient records", new MenuViewPatientRecordService()),
    ADD_PATIENT(3, "Add new patient", new MenuAddPatientService()),
    VIEW_DOCTOR_RECORDS(4, "View doctor records", new MenuViewDoctorRecordService()),
    ADD_DOCTOR(5, "Add new doctor", new MenuAddDoctorService()),
    BOOK_APPOINTMENT(6, "Book appointment", new MenuBookAppointmentService()),
    VIEW_APPOINTMENT(7, "View appointment", new MenuViewAppointmentService()),
    CANCEL_APPOINTMENT(8, "Cancel appointment", new MenuCancelAppointmentService()),
    GENERATE_BILL(9, "Generate bill", new MenuGenerateBillService()),
    EXIT(10, "Exit", new MenuExitService()),
    UNKNOWN;

    private Menu() {
    }

    private int number;
    private String label;
    private MenuService service;

    private Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public static Menu find(int selectedNumber) {
        Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (selectedNumber == m[i].getNumber()) {
                return m[i];
            }
        }
        return UNKNOWN;
    }

}
