package com.xworkz.inheritance.internal.tools;

public class Axe extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Axe");
    }

    @Override
    public void use() {
        System.out.println("Using the Axe");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Axe");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Axe");
    }

    @Override
    public void store() {
        System.out.println("Storing the Axe");
    }
}
