package com.xworkz.inheritance.internal.tools;

public class Drill extends Tool {
    public void bore() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Drill boring");
    }
}
