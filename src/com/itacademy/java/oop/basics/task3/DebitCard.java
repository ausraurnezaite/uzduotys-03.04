package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card {


    public DebitCard(String cardHolderName, String cardNumber) {
        super(cardHolderName, cardNumber);
    }

    @Override
    public void credit(double amount) {
        if (this.getBalance() - amount >= 0) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Amount withdrawn: " + amount + ". Your balance is: " + this.getBalance());
        } else {
            throw new NotEnoughBalanceException("Not enough funds. Your balance is: " + this.getBalance());
        }
    }

    @Override
    public void debit(double amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("Balance is: " + this.getBalance());
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public String getCardHolderName() {
        return super.getCardHolderName();
    }

    @Override
    public String getCardNumber() {
        return super.getCardNumber();
    }

}

/*
Create class CreditCard with fields interest(double), credit(double) which extends Card.

•	CreditCard has an interest which is a percentage value. It is used when withdrawing money from ATM.
For example, if withdrawing 100 and interest is 1% then it will deduct 1% from 100 from credit card balance as payment for withdrawal.
•	CreditCard credit value is not modifiable after object was created.

•	credit?> method works the same for both cards it reduces its balance.
    Credit card negative balance can not be less than it’s credit value.
    If trying to debit credit card makes it more than it’s credit throw an exception NotEnoughtCreditException.

•	debit methods works the same for both Debit and Credit cards it increases their balance.
•	You must catch exceptions and display explanation messages in console what happened.
    Your custom exceptions must have their unique messages.
•	When using Atm you must use debit and credit to change card balance values.

 */
