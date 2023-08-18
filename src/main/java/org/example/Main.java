package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo() {
        try (Scanner scanner = new Scanner(System.in)) {
            firstTask(scanner);
            secondTask(scanner);
            thirdTask(scanner);
            fourTask(scanner);
        }
    }

    public static void firstTask(Scanner scanner){
        NumberInputHandler.enterNumber(scanner);
    }
    public static void secondTask(Scanner scanner){
        PriceFinder.findPrice(scanner);
    }
    public static void thirdTask(Scanner scanner){
        PaymentProcessor.runPaymentDemo(scanner);

    }
    public static void fourTask(Scanner scanner){
        TemperatureController.tempController(scanner);
    }
}


