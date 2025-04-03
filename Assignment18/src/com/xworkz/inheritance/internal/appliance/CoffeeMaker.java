package com.xworkz.inheritance.internal.appliance;

public class CoffeeMaker extends Appliance {
    public void brewCoffee() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("CoffeeMaker brewing coffee");
    }
}