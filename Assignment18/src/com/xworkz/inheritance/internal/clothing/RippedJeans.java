package com.xworkz.inheritance.internal.clothing;

public class RippedJeans extends Jeans {
    public void showStyle() {
        System.out.println("RippedJeans showing off style");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof RippedJeans) {
            RippedJeans rj = (RippedJeans) clothing;
            rj.showStyle();
        } else {
            System.out.println("Not RippedJeans");
        }
    }
}
