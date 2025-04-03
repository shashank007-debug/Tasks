package com.xworkz.inheritance.internal.appliance;

public class Refrigerator extends Appliance {
    public void coolFood() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("Refrigerator cooling food");
    }
}