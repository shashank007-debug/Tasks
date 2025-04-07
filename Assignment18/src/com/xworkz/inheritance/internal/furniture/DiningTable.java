package com.xworkz.inheritance.internal.furniture;

public class DiningTable extends Table {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof DiningTable) {
            DiningTable obj = (DiningTable) furniture;
            obj.serveMeals();
        } else {
            System.out.println("Furniture is not an instance of DiningTable");
        }
    }

    public void serveMeals() {
        System.out.println("Serving meals on DiningTable");
    }
}
