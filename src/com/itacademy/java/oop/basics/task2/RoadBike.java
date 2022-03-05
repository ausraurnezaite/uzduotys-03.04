package com.itacademy.java.oop.basics.task2;

import java.util.Scanner;

public final class RoadBike implements Bicycle {

    private static final int MAX_SPEED = 50;
    private static final int MIN_SPEED = 0;
    private static final int MAX_GEAR = 10;
    private static final int MIN_GEAR = 0;

    private int gear = 1;
    private int speed = 0;

    public RoadBike() {
    }

    @Override
    public void applyBrakes() {
        Scanner sc = new Scanner(System.in);
        int kiek;
        do {
            System.out.print("kiek stabdyti: ");
            kiek = sc.nextInt();
            if (kiek > 0) {
                System.out.println("it cannot be a positive number. Try using negative number.");
            } else if (this.speed + kiek < MIN_SPEED) {
                System.out.println("value is too high. The highest possible value is " + (MIN_SPEED - this.speed));
            }
        } while (kiek > 0 || this.speed + kiek < MIN_SPEED);
        this.speed += kiek;
        System.out.println("Dabartinis greitis: " + this.speed);
    }


    private boolean isValidIncrement(int sk) {
        if (sk < 0) {
            System.out.println("it cannot be negative number. Try using positive number.");
            return false;
        } else if (this.speed + sk > MAX_SPEED) {
            System.out.println("value is too high. The highest possible value is " + (MAX_SPEED - this.speed));
            return false;
        }
        return true;
    }

    public void speedUp() {
        Scanner sc = new Scanner(System.in);
        int increment;
        while (true) {
            System.out.print("Kiek gazuoti? ");
            increment = sc.nextInt();
            if (isValidIncrement(increment)) {
                this.speed += increment;
                System.out.println("Dabartinis greitis: " + this.speed);
                break;
            }
        }
    }

    @Override
    public void speedUp(int increment) {
        if (isValidIncrement(increment)) {
            this.speed += increment;
            System.out.println("Greitis buvo padidintas: " + increment + " Dabartinis greitis: " + this.speed);
        } else {
            speedUp();
        }
    }

    private boolean isValidGear(int sk) {
        if (sk != 1 && sk != 2 && sk != -1 && sk != -2) {
            System.out.print("Value is not allowed. ");
            if (sk < -2) {
                System.out.println("Try using -2");
            } else if (sk > 2) {
                System.out.println("Try using 2");
            } else if (sk == 0) {
                System.out.println("Try using -1 or 1");
            }
            return false;
        } else if (this.gear + sk > MAX_GEAR || this.gear + sk < MIN_GEAR) {
            System.out.println("Value is not allowed. Gear cannot be over the max " + MAX_GEAR + " or below " + MIN_GEAR);
            return false;
        }
        return true;
    }

    @Override
    public void changeGear(int newGear) {
        if (isValidGear(newGear)) {
            this.gear += newGear;
            System.out.println("New gear: " + this.gear);
        } else {
            changeGear();
        }
    }

    public void changeGear() {
        Scanner sc = new Scanner(System.in);
        int kiek;
        while (true) {
            System.out.print("Change gear by: ");
            kiek = sc.nextInt();
            if (isValidGear(kiek)) {
                this.gear += kiek;
                System.out.println("New gear: " + this.gear);
                break;
            }
        }
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}
/*
•	RoadBike applyBrakes() –
    it should not allow road bike to move backwards.
    It’s speed cannot be negative.
    Brakes can only be applied using negative values.
    If braking using positive value print a message suggesting using negative value.
    Road bike speed cannot be negative.
    If everything passed print new road bike speed.

•	RoadBike speedUp() –
    should allow only positive numbers.
    If negative numbers are supplied print a message saying it is negative and suggest using positive numbers.
    Road bike can achieve maximum speed of 50.
    If increasing, it’s speed makes it over 50 do not increase speed and print a message saying that speed is too high and suggest the highest possible increment it can be increased.
    If everything passes increase mountain bike speed and print, it’s new speed.

•	RoadBike changeGear() –
    gear can only be increased or decreased by only 1 or 2 or  -1 or -2.
    If anything, other than 1 or 2 or  -1 or -2 is supplied print a message saying that value is not allowed and suggest using the closest allowed value in regards to the supplied value.
    Road bike gear cannot be negative. Lowest allowed gear is 0 highest allowed gear is 10.
    If gear change brakes these limits print a message saying that it was either over the max 10 or below 0.
    If everything passes print out new road bike gear.

 */
