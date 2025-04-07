package com.xworkz.inheritance.internal.appliance;

public class SmartRefrigerator extends Refrigerator {
    public void trackInventory() {
        System.out.println("SmartRefrigerator tracking inventory");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(Refrigerator refrigerator) {
        if (refrigerator instanceof SmartRefrigerator) {
            SmartRefrigerator smart = (SmartRefrigerator) refrigerator;
            smart.trackInventory();
        } else {
            System.out.println("Not a SmartRefrigerator");
        }
    }
}
