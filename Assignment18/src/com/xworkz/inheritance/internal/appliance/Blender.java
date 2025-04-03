package com.xworkz.inheritance.internal.appliance;

public class Blender extends Appliance {
    public void blend() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("Blender blending");
    }
}