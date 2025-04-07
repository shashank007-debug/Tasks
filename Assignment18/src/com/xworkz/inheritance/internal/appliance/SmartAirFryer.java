package com.xworkz.inheritance.internal.appliance;

public class SmartAirFryer extends AirFryer {
    public void connectToWifi() {
        System.out.println("SmartAirFryer connected to Wi-Fi");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(AirFryer airFryer) {
        if (airFryer instanceof SmartAirFryer) {
            SmartAirFryer smart = (SmartAirFryer) airFryer;
            smart.connectToWifi();
        } else {
            System.out.println("Not a SmartAirFryer");
        }
    }
}

