package com.xworkz.inheritance.internal.electronicdevice;

public class FitnessWatch extends SmartWatch {
    public void trackSteps() {
        System.out.println("FitnessWatch tracking steps");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof FitnessWatch) {
            ((FitnessWatch) device).trackSteps();
        } else {
            System.out.println("Not a FitnessWatch");
        }
    }
}
