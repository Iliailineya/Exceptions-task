package org.example;

import org.example.customException.*;

import java.util.Scanner;

class TemperatureController {
    public static void tempController(Scanner scanner) {
        while (true) {
            try {
                checkTemperatureRange(getCurrentTemperature(scanner));
                System.out.println("Device is operational.");
                break;
            } catch (TemperatureOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double getCurrentTemperature(Scanner scanner) {
        System.out.print("Enter current temperature: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public static void checkTemperatureRange(double temperature) throws TemperatureOutOfRangeException {
        if (temperature < -10 || temperature > 35) {
            throw new TemperatureOutOfRangeException("Device cannot operate. Please enter values from the temperature range.");
        }
    }
}
