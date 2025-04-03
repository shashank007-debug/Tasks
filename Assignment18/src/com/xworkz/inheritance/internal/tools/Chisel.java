package com.xworkz.inheritance.internal.tools;

public class Chisel extends Tool {
    public void carve() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Chisel carving");
    }
}