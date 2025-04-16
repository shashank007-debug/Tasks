package com.xworkz.inheritance.internal1;

public class CryptoPayment extends PaymentMethod {
    public void verifyWallet() {
        System.out.println("Verifying crypto wallet");
    }

    public void convertToFiat() {
        System.out.println("Converting crypto to fiat currency");
    }
}
