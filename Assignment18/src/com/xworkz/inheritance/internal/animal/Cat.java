package com.xworkz.inheritance.internal.animal;

public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Cat");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Cat");
    }
    @Override
    public void move() {
        System.out.println("Running move in Cat");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Cat");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Cat");
    }
}