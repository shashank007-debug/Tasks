package com.xworkz.inheritance.internal.tools;

public class Axe extends Tool {
    public void chop() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Axe chopping");
    }
}