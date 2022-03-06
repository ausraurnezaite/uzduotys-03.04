package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm {
    private double atmBalance;

    public MyBankAtm(double atmBalance) {
        this.atmBalance = atmBalance;
    }

    @Override
    public void withdraw(Card card, double amount) {
        if (amount > this.atmBalance) {
            throw new InsufficientAtmFundsException("There is not enough funds in the ATM");
        } else {
            card.credit(amount);
            this.atmBalance -= amount;
        }
    }

    @Override
    public void deposit(Card card, double amount) {
        card.debit(amount);
        this.atmBalance += amount;
    }

    public double getAtmBalance() {
        return atmBalance;
    }
}
/*
•	Create interface Atm with method to withdraw using CreditCard and DebitCard.
    It will be used when withdrawing money from the ATM
•	Create class MyBankAtm implementing Atm interface.
•	Create one MyBankAtm. MyBankAtm must have it’s balance as a field.
    You can not withdraw more money then there is in ATM.
    When trying to withdraw more money than there is in ATM throw an exception InsuficientAtmFundsException.
 */