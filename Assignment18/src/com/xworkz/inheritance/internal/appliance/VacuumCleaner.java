package com.xworkz.inheritance.internal.appliance;

public class VacuumCleaner extends Appliance {
    public void vacuum() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("VacuumCleaner vacuuming");
    }
}