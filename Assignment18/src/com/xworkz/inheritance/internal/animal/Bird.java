package com.xworkz.inheritance.internal.animal;

public class Bird extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Bird");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Bird");
    }
    @Override
    public void move() {
        System.out.println("Running move in Bird");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Bird");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Bird");
    }
}