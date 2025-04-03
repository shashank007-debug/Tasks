package com.xworkz.inheritance.internal.tools;

public class Rake extends Tool {
    public void gather() {
        super.grip();
        super.use();
        super.sharpen();
        super.clean();
        super.store();
        System.out.println("Rake gathering");
    }
}