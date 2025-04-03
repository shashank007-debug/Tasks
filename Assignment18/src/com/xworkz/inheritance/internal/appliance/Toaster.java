package com.xworkz.inheritance.internal.appliance;


public class Toaster extends Appliance {
    public void toastBread() {
        super.plugIn();
        super.turnOn();
        super.turnOff();
        super.clean();
        super.repair();
        System.out.println("Toaster toasting bread");
    }
}