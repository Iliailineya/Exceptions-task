package org.example.customException;

public class PriceOutOfRangeException extends Exception {
    public PriceOutOfRangeException(String message) {
        super(message);
    }
}
