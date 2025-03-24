package com.xworkz.AccessModifier;

import com.xworkz.AccessModifier.External.Patient;
import com.xworkz.AccessModifier.Internal.Doctor;
import com.xworkz.AccessModifier.Internal.Nurse;

public class HospitalRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.display();

        Patient patient = new Patient();
        patient.display();

        Nurse nurse = new Nurse();
        nurse.assist();
    }
}
