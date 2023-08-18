package org.example;

import java.util.Scanner;

class NumberInputHandler {
    public static void enterNumber(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Enter a number: ");
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println("The number is: " + number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: value is not a correct number.");
            }
        }
    }
}
