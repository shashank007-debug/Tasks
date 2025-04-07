package com.xworkz.inheritance.internal.appliance;

public class SmartCoffeeMaker extends CoffeeMaker {
    public void scheduleBrew() {
        System.out.println("SmartCoffeeMaker scheduled for brewing");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(CoffeeMaker coffeeMaker) {
        if (coffeeMaker instanceof SmartCoffeeMaker) {
            SmartCoffeeMaker smart = (SmartCoffeeMaker) coffeeMaker;
            smart.scheduleBrew();
        } else {
            System.out.println("Not a SmartCoffeeMaker");
        }
    }
}
