package com.xworkz.inheritance.internal.tools;

public class Hammer extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Hammer");
    }

    @Override
    public void use() {
        System.out.println("Using the Hammer");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Hammer");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Hammer");
    }

    @Override
    public void store() {
        System.out.println("Storing the Hammer");
    }
}
