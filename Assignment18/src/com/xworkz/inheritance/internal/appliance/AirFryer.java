package com.xworkz.inheritance.internal.appliance;

public class AirFryer extends Appliance {
    public void airFry() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("AirFryer air frying");
    }
}