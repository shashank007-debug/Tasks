package com.xworkz.inheritance.internal.appliance;

public class Dishwasher extends Appliance {
    public void washDishes() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("Dishwasher washing dishes");
    }
}