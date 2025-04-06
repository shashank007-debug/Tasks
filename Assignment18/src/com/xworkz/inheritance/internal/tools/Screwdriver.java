package com.xworkz.inheritance.internal.tools;

public class Screwdriver extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Screwdriver");
    }

    @Override
    public void use() {
        System.out.println("Using the Screwdriver");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Screwdriver");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Screwdriver");
    }

    @Override
    public void store() {
        System.out.println("Storing the Screwdriver");
    }
}
