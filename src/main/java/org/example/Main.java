package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo() {
        try (Scanner scanner = new Scanner(System.in)) {
            NumberInputHandler.demoNumFormatException(scanner);
            PriceFinder.findPrice(scanner);
            PaymentProcessor.runPaymentDemo(scanner);
            TemperatureController.runTemperatureDemo(scanner);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Что-то прям сломалось=)");
        }
    }
}


