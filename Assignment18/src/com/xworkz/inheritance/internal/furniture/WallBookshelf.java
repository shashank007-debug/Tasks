package com.xworkz.inheritance.internal.furniture;

public class WallBookshelf extends Bookshelf {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof WallBookshelf) {
            WallBookshelf obj = (WallBookshelf) furniture;
            obj.holdBooks();
        } else {
            System.out.println("Furniture is not an instance of WallBookshelf");
        }
    }

    public void holdBooks() {
        System.out.println("Holding books in WallBookshelf");
    }
}
