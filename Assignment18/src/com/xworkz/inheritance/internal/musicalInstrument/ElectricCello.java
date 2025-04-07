package com.xworkz.inheritance.internal.musicalInstrument;

public class ElectricCello extends Cello {
    public ElectricCello() {
        System.out.println("Constructor of ElectricCello");
    }

    public void bow() {
        System.out.println("Bowing the Electric Cello");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Cello cello) {
        if (cello instanceof ElectricCello) {
            ElectricCello ec = (ElectricCello) cello;
            ec.bow();
        } else {
            System.out.println("Not an ElectricCello");
        }
    }
}
