package com.xworkz.inheritance.internal.tools;

public class Screwdriver extends Tool {
    public void twist() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Screwdriver twisting");
    }
}