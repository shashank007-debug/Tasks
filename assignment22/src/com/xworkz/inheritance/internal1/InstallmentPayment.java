package com.xworkz.inheritance.internal1;

public class InstallmentPayment extends PaymentMethod {
    public void calculateInstallments() {
        System.out.println("Calculating installment plan");
    }

    public void schedulePayments() {
        System.out.println("Scheduling future payments");
    }
}