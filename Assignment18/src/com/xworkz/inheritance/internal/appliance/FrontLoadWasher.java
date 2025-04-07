package com.xworkz.inheritance.internal.appliance;

public class FrontLoadWasher extends WashingMachine {
    public void activateSteamWash() {
        System.out.println("FrontLoadWasher steam wash activated");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(WashingMachine washingMachine) {
        if (washingMachine instanceof FrontLoadWasher) {
            FrontLoadWasher front = (FrontLoadWasher) washingMachine;
            front.activateSteamWash();
        } else {
            System.out.println("Not a FrontLoadWasher");
        }
    }
}
