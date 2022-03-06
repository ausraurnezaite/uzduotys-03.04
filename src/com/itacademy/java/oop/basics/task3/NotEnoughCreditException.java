package com.itacademy.java.oop.basics.task3;

public class NotEnoughCreditException extends IllegalArgumentException {

    public NotEnoughCreditException(String message) {
        super(message);
    }
}
