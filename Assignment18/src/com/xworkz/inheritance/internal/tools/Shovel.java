package com.xworkz.inheritance.internal.tools;

public class Shovel extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Shovel");
    }

    @Override
    public void use() {
        System.out.println("Using the Shovel");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Shovel");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Shovel");
    }

    @Override
    public void store() {
        System.out.println("Storing the Shovel");
    }
}
