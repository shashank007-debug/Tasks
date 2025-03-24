package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Hospital;

public class Nurse {
    Hospital hospital = new Hospital();

    public void assist() {
        hospital.name = "General Hospital";
        System.out.println("Nurse assisting at: " + hospital.name);
        hospital.manageStaff();
    }
}
