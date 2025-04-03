package com.xworkz.inheritance.internal.tools;

public class Pliers extends Tool {
    public void clamp() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Pliers clamping");
    }
}