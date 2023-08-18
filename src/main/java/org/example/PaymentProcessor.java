package org.example;

import org.example.customException.InsufficientFundsException;

import java.util.Scanner;

class PaymentProcessor {
    static final double BALANCE = 1000.0;

    public static void runPaymentDemo(Scanner scanner) {
        try {
            validatePayment(getPurchaseAmount(scanner), BALANCE);
            System.out.println("Payment successful!");
        } catch (InsufficientFundsException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }

    public static double getPurchaseAmount(Scanner scanner) {
        System.out.print("Enter purchase amount: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public static void validatePayment(double purchaseAmount, double availableBalance) throws InsufficientFundsException {
        if (purchaseAmount > availableBalance) {
            throw new InsufficientFundsException("Insufficient funds on the card.");
        }
    }
}
