package com.xworkz.inheritance.internal.appliance;

public class SilentDishwasher extends Dishwasher {
    public void enableSilentMode() {
        System.out.println("SilentDishwasher running in silent mode");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(Dishwasher dishwasher) {
        if (dishwasher instanceof SilentDishwasher) {
            SilentDishwasher silent = (SilentDishwasher) dishwasher;
            silent.enableSilentMode();
        } else {
            System.out.println("Not a SilentDishwasher");
        }
    }
}
