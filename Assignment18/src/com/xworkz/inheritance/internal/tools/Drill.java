package com.xworkz.inheritance.internal.tools;

public class Drill extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Drill");
    }

    @Override
    public void use() {
        System.out.println("Using the Drill");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Drill");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Drill");
    }

    @Override
    public void store() {
        System.out.println("Storing the Drill");
    }
}
