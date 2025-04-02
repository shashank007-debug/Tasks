package com.xworkz.inheritance.internal.animal;

public class Dolphin extends Animal {
    public void jump() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Dolphin jumping");
    }
}
