package com.xworkz.inheritance.internal.furniture;

public class SlidingWardrobe extends Wardrobe {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof SlidingWardrobe) {
            SlidingWardrobe obj = (SlidingWardrobe) furniture;
            obj.storeClothes();
        } else {
            System.out.println("Furniture is not an instance of SlidingWardrobe");
        }
    }

    public void storeClothes() {
        System.out.println("Storing clothes in SlidingWardrobe");
    }
}
