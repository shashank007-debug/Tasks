package com.xworkz.inheritance.internal.animal;

public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Dog");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Dog");
    }
    @Override
    public void move() {
        System.out.println("Running move in Dog");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Dog");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Dog");
    }
}