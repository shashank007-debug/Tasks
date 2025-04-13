package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.*;

public class Runner {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt("Souled Store", "L","Black");
        Tshirt tshirt2 = new Tshirt("Souled Store", "L","Black");
        boolean same = tshirt1.equals(tshirt2);
        System.out.println("Both Tshirts are same : "+same);
    }
}
