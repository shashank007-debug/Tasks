package com.xworkz.inheritance.internal.furniture;

public class OfficeDesk extends Desk {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof OfficeDesk) {
            OfficeDesk obj = (OfficeDesk) furniture;
            obj.organizeDocuments();
        } else {
            System.out.println("Furniture is not an instance of OfficeDesk");
        }
    }

    public void organizeDocuments() {
        System.out.println("Organizing documents on OfficeDesk");
    }
}
