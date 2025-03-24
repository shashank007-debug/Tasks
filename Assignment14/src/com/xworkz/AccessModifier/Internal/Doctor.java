package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Hospital;

public class Doctor {
    Hospital hospital = new Hospital();

    public void display() {
        System.out.println("Doctor class display method");
        hospital.name = "City Hospital";
        System.out.println("Hospital Name: " + hospital.name);
        hospital.admitPatient();
        System.out.println("========================================");
    }
}
