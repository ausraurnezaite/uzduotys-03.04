package com.itacademy.java.oop.basics.task3;

public class AtmApplication {

    public static void main(String[] args) {

        MyBankAtm atm = new MyBankAtm(100);
        CreditCard creditCard = new CreditCard("ausra", "ausroskortele", 500, 1);
        DebitCard debitCard = new DebitCard("zuikis", "katinokortele");
        atm.deposit(debitCard, 200);
        atm.deposit(creditCard, 100);

        try {
            atm.withdraw(debitCard, 50);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            atm.withdraw(debitCard, 250);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            atm.withdraw(creditCard, 200);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            atm.withdraw(creditCard, 400);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }


    }
}

/*
Task 3
•	Create a package, name: com.itacademy.java.oop.basics.task3
•	Create class AtmApplication with main method.
•	Create abstract class Card with
        methods:credit(double) and debit(double amount)
        fields: balance(double), cardHolderName(string) and cardNumber(string).
•	Create class CreditCard with fields interest(double), credit(double) which extends Card.
•	Create class DebitCard and extend Card.

•	Create interface Atm with method to withdraw using CreditCard and DebitCard.
    It will be used when withdrawing money from the ATM
•	Create class MyBankAtm implementing Atm interface.
•	Create one MyBankAtm. MyBankAtm must have it’s balance as a field.
    You can not withdraw more money then there is in ATM.
    When trying to withdraw more money than there is in ATM throw an exception InsuficientAtmFundsException.

•	Use all the methods and play around to see if all of the business logic below works as expected.

 */