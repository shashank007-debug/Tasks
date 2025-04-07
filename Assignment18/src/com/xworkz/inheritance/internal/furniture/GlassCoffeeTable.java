package com.xworkz.inheritance.internal.furniture;

public class GlassCoffeeTable extends CoffeeTable {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof GlassCoffeeTable) {
            GlassCoffeeTable obj = (GlassCoffeeTable) furniture;
            obj.displayDecor();
        } else {
            System.out.println("Furniture is not an instance of GlassCoffeeTable");
        }
    }

    public void displayDecor() {
        System.out.println("Displaying decor on GlassCoffeeTable");
    }
}
