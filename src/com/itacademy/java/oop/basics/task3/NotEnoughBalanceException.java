package com.itacademy.java.oop.basics.task3;

public class NotEnoughBalanceException extends IllegalArgumentException {

    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
