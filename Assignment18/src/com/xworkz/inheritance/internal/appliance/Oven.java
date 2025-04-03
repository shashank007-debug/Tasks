package com.xworkz.inheritance.internal.appliance;

public class Oven extends Appliance {
    public void bake() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("Oven baking");
    }
}