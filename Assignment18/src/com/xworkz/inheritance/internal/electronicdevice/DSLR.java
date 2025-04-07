package com.xworkz.inheritance.internal.electronicdevice;

public class DSLR extends Camera {
    public void takePhoto() {
        System.out.println("DSLR taking a high-resolution photo");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof DSLR) {
            ((DSLR) device).takePhoto();
        } else {
            System.out.println("Not a DSLR");
        }
    }
}
