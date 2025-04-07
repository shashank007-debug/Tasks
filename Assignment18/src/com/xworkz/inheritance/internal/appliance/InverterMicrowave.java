package com.xworkz.inheritance.internal.appliance;

public class InverterMicrowave extends Microwave {
    public void enableEcoMode() {
        System.out.println("InverterMicrowave eco mode enabled");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(Microwave microwave) {
        if (microwave instanceof InverterMicrowave) {
            InverterMicrowave inverter = (InverterMicrowave) microwave;
            inverter.enableEcoMode();
        } else {
            System.out.println("Not an InverterMicrowave");
        }
    }
}
