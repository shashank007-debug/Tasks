package com.xworkz.inheritance.internal.clothing;

public class ThermalUnderwear extends Underwear {
    public void retainHeat() {
        System.out.println("ThermalUnderwear retaining body heat");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof ThermalUnderwear) {
            ThermalUnderwear tu = (ThermalUnderwear) clothing;
            tu.retainHeat();
        } else {
            System.out.println("Not ThermalUnderwear");
        }
    }
}
