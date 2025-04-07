package com.xworkz.inheritance.internal.clothing;

public class BeachShorts extends Shorts {
    public void dryFast() {
        System.out.println("BeachShorts drying quickly");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof BeachShorts) {
            BeachShorts bs = (BeachShorts) clothing;
            bs.dryFast();
        } else {
            System.out.println("Not BeachShorts");
        }
    }
}
