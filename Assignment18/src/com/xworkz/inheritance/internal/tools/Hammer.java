package com.xworkz.inheritance.internal.tools;

public class Hammer extends Tool {
    public void nail() {
        super.grip(); super.use(); super.sharpen(); super.clean(); super.store();
        System.out.println("Hammer nailing");
    }
}