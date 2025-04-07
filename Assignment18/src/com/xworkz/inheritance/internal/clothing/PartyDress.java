package com.xworkz.inheritance.internal.clothing;

public class PartyDress extends Dress {
    public void sparkle() {
        System.out.println("PartyDress sparkling on the dance floor");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof PartyDress) {
            PartyDress pd = (PartyDress) clothing;
            pd.sparkle();
        } else {
            System.out.println("Not a PartyDress");
        }
    }
}
