package org.example;

import org.example.customException.PriceOutOfRangeException;

import java.util.Scanner;

class PriceFinder {
    public static void findPrice(Scanner scanner) {
        double[] prices = {10.5, 15.2, 20.0, 18.7, 12.3};
        while (true) {
            try {
                int index = getIndex(scanner);
                checkIndex(index, prices);
                System.out.println("Price according to the index " + index + ": " + prices[index]);
                break;
            } catch (PriceOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkIndex(int index, double[] prices) throws PriceOutOfRangeException, NumberFormatException {
        if (index < 0 || index >= prices.length)
            throw new PriceOutOfRangeException("Error: The entered index is invalid. Please enter values from the range.");
    }

    public static int getIndex(Scanner scanner) {
        System.out.print("Enter the price index (from 0 to 4): ");
        return Integer.parseInt(scanner.nextLine());
    }

}

