package com.itacademy.java.oop.basics.task3;

public class InsufficientAtmFundsException extends IllegalArgumentException {

    public InsufficientAtmFundsException(String message) {
        super(message);
    }
}
