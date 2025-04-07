package com.xworkz.inheritance.internal.furniture;

public class MirrorDresser extends Dresser {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof MirrorDresser) {
            MirrorDresser obj = (MirrorDresser) furniture;
            obj.useMirror();
        } else {
            System.out.println("Furniture is not an instance of MirrorDresser");
        }
    }

    public void useMirror() {
        System.out.println("Using mirror on MirrorDresser");
    }
}
