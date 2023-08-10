package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);

            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: value is not a correct number.");
        }
    }
}