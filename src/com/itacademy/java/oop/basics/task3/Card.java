package com.itacademy.java.oop.basics.task3;

public abstract class Card {
    protected double balance;
    protected String cardHolderName;
    protected String cardNumber;

    public Card(String cardHolderName, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.balance = 0;
    }

    public void credit(double credit) {
    }

    public void debit(double debit) {
    }

    public double getBalance() {
        return balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
/*
•	Create abstract class Card with
        methods:credit(double) and debit(double amount)
        fields: balance(double), cardHolderName(string) and cardNumber(string).
 */