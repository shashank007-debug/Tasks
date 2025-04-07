package com.xworkz.inheritance.internal.clothing;

public class WoolSocks extends Socks {
    public void keepFeetWarm() {
        System.out.println("WoolSocks keeping feet warm");
    }

    public void invokeAllInheritedMethods() {
        wear();
        wash();
        dry();
        iron();
        fold();
    }

    public void checkAndCast(Clothing clothing) {
        if (clothing instanceof WoolSocks) {
            WoolSocks ws = (WoolSocks) clothing;
            ws.keepFeetWarm();
        } else {
            System.out.println("Not WoolSocks");
        }
    }
}
