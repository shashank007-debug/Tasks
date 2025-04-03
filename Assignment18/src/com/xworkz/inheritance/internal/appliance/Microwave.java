package com.xworkz.inheritance.internal.appliance;

public class Microwave extends Appliance {
    public void heatFood() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("Microwave heating food");
    }
}