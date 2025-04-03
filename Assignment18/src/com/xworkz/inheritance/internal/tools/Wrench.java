package com.xworkz.inheritance.internal.tools;

public class Wrench extends Tool {
    public void tighten() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Wrench tightening");
    }
}