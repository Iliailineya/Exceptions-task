package org.example.customException;

public class TemperatureOutOfRangeException extends Exception {
    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}

