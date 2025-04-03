package com.xworkz.inheritance.internal.appliance;

public class WashingMachine extends Appliance {
    public void washClothes() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("WashingMachine washing clothes");
    }
}