package com.xworkz.inheritance.internal.clothing;

public class WinterJacket extends Jacket {
    public void keepWarm() {
        System.out.println("WinterJacket keeping you warm");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof WinterJacket) {
            WinterJacket wj = (WinterJacket) clothing;
            wj.keepWarm();
        } else {
            System.out.println("Not a WinterJacket");
        }
    }
}
