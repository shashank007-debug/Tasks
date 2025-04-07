package com.xworkz.inheritance.internal.clothing;

public class KnittedSweater extends Sweater {
    public void stretchFit() {
        System.out.println("KnittedSweater providing stretchy fit");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof KnittedSweater) {
            KnittedSweater ks = (KnittedSweater) clothing;
            ks.stretchFit();
        } else {
            System.out.println("Not KnittedSweater");
        }
    }
}
