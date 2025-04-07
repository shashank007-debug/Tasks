package com.xworkz.inheritance.internal.furniture;

public class ModularCabinet extends Cabinet {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof ModularCabinet) {
            ModularCabinet obj = (ModularCabinet) furniture;
            obj.organizeItems();
        } else {
            System.out.println("Furniture is not an instance of ModularCabinet");
        }
    }

    public void organizeItems() {
        System.out.println("Organizing items in ModularCabinet");
    }
}
