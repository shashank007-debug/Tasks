package com.xworkz.inheritance.internal.electronicdevice;

public class iPad extends Tablet {
    public void draw() {
        System.out.println("iPad drawing using Apple Pencil");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof iPad) {
            ((iPad) device).draw();
        } else {
            System.out.println("Not an iPad");
        }
    }
}
