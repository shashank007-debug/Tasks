package com.xworkz.inheritance.internal.musicalInstrument;

public class ElectricDrumKit extends Drums {
    public ElectricDrumKit() {
        System.out.println("Constructor of ElectricDrumKit");
    }

    public void beat() {
        System.out.println("Beating Electric Drum Kit");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Drums drums) {
        if (drums instanceof ElectricDrumKit) {
            ElectricDrumKit edk = (ElectricDrumKit) drums;
            edk.beat();
        } else {
            System.out.println("Not an ElectricDrumKit");
        }
    }
}