package com.xworkz.inheritance.internal.appliance;

public class ConvectionOven extends Oven {
    public void toggleConvectionMode() {
        System.out.println("ConvectionOven convection mode toggled");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(Oven oven) {
        if (oven instanceof ConvectionOven) {
            ConvectionOven convection = (ConvectionOven) oven;
            convection.toggleConvectionMode();
        } else {
            System.out.println("Not a ConvectionOven");
        }
    }
}
