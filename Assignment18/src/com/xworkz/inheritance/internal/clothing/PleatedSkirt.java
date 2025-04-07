package com.xworkz.inheritance.internal.clothing;

public class PleatedSkirt extends Skirt {
    public void twirl() {
        System.out.println("PleatedSkirt twirling beautifully");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof PleatedSkirt) {
            PleatedSkirt ps = (PleatedSkirt) clothing;
            ps.twirl();
        } else {
            System.out.println("Not a PleatedSkirt");
        }
    }
}
