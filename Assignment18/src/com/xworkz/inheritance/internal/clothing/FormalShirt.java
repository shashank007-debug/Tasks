package com.xworkz.inheritance.internal.clothing;

public class FormalShirt extends Shirt {
    public void tuckIn() {
        System.out.println("FormalShirt tucked in neatly");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof FormalShirt) {
            FormalShirt fs = (FormalShirt) clothing;
            fs.tuckIn();
        } else {
            System.out.println("Not a FormalShirt");
        }
    }
}
