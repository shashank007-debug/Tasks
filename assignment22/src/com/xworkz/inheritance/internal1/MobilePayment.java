package com.xworkz.inheritance.internal1;

public class MobilePayment extends PaymentMethod {
    public void authenticateDevice() {
        System.out.println("Authenticating mobile device");
    }

    public void processToken() {
        System.out.println("Processing secure payment token");
    }
}