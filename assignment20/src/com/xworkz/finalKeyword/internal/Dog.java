package com.xworkz.finalKeyword.internal;

public final class Dog { // prevents inheritance
    private final String breed = "Shitzu"; // values cannot be changed once initialized
    private final double price = 90000;
    private final double weight = 60;

    public final void bark(){ //cannot be overridden
        System.out.println("Dog Breed : "+this.breed);
        System.out.println("Dog Price : "+this.price);
        System.out.println("Dog Weight : "+this.weight);
        System.out.println("Dog is barking");
    }
}
