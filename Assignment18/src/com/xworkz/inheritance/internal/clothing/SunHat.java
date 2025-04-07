package com.xworkz.inheritance.internal.clothing;

public class SunHat extends Hat {
    public void blockSunlight() {
        System.out.println("SunHat blocking sunlight");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof SunHat) {
            SunHat hat = (SunHat) clothing;
            hat.blockSunlight();
        } else {
            System.out.println("Not a SunHat");
        }
    }
}
