package com.xworkz.inheritance.internal1;

public class BNPL extends PaymentMethod {
    public void creditCheck() {
        System.out.println("Performing credit check");
    }

    public void scheduleFuturePayment() {
        System.out.println("Scheduling future payment date");
    }
}