package com.xworkz.AccessModifier.External;

public class Patient {
    Hospital hospital = new Hospital();

    public void display() {
        hospital.location = "Downtown";
        System.out.println("Patient visiting hospital at: " + hospital.location);
        hospital.manageStaff();
        hospital.admitPatient();
        System.out.println("========================================");
    }
}
