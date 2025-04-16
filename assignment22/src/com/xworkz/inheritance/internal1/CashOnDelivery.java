package com.xworkz.inheritance.internal1;

public class CashOnDelivery extends PaymentMethod {
    public void generateDeliveryNote() {
        System.out.println("Generating cash on delivery note");
    }

    public void confirmReceipt() {
        System.out.println("Confirming cash receipt upon delivery");
    }
}