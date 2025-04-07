package com.xworkz.inheritance.internal.appliance;

public class DigitalToaster extends Toaster {
    public void setToastingLevel() {
        System.out.println("DigitalToaster toasting level set to medium");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(Toaster toaster) {
        if (toaster instanceof DigitalToaster) {
            DigitalToaster digital = (DigitalToaster) toaster;
            digital.setToastingLevel();
        } else {
            System.out.println("Not a DigitalToaster");
        }
    }
}
