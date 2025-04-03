package com.xworkz.inheritance.internal.tools;

public class Shovel extends Tool {
    public void dig() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Shovel digging");
    }
}
