package com.xworkz.inheritance.internal.musicalInstrument;

public class BambooFlute extends Flute {
    public BambooFlute() {
        System.out.println("Constructor of BambooFlute");
    }

    public void whistle() {
        System.out.println("Whistling Bamboo Flute");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Flute flute) {
        if (flute instanceof BambooFlute) {
            BambooFlute bf = (BambooFlute) flute;
            bf.whistle();
        } else {
            System.out.println("Not a BambooFlute");
        }
    }
}
