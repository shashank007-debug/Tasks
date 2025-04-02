package com.xworkz.inheritance.internal.animal;

public class Cat extends Animal {
    public void purr() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Cat purring");
    }
}