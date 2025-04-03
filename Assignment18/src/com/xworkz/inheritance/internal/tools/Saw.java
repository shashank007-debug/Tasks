package com.xworkz.inheritance.internal.tools;

public class Saw extends Tool {
    public void cut() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Saw cutting");
    }
}