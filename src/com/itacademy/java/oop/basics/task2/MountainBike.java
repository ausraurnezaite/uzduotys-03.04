package com.itacademy.java.oop.basics.task2;

import java.util.Scanner;

public final class MountainBike implements Bicycle {

    private static final int MAX_SPEED = 100;
    private static final int MIN_SPEED = -10;
    private static final int MAX_GEAR = 20;
    private static final int MIN_GEAR = 0;


    private int gear = 1;
    private int speed = 0;


    public MountainBike() {
    }

    @Override
    public void applyBrakes() {
        Scanner sc = new Scanner(System.in);
        int kiek;
        do {
            System.out.print("kiek stabdyti: ");
            kiek = sc.nextInt();
            if (kiek < 0) {
                System.out.println("it cannot be a negative number. Try using positive number.");
            } else if (this.speed - kiek < MIN_SPEED) {
                System.out.println("value is too high. The highest possible value is " + (this.speed - MIN_SPEED));
            }
        } while (kiek < 0 || this.speed - kiek < MIN_SPEED);
        this.speed -= kiek;
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
//         ARBA SU REKURSIJA???
//        System.out.print("kiek gazuoti? ");
//        int kiek = sc.nextInt();
//        if (isValidIncrement(kiek)) {
//            this.speed += kiek;
//            System.out.println("Dabartinis greitis: " + this.speed);
//        } else {
//            speedUp();
//        }
//    }

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
        if (sk != 1 && sk != -1) {
            System.out.println("Value is not allowed. Try using 1 or -1.");
            return false;
        } else if (this.gear + sk > MAX_GEAR || this.gear + sk < MIN_GEAR) {
            System.out.println("Value is not allowed. Gear cannot be over the max " + MAX_GEAR + " or below " + MIN_GEAR + ".");
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
•	Create classes MountainBike and RoadBike with fields int gear and int speed. They must implement Bicycle interface.
Requirements:
•	MountainBike applyBrakes()
    should allow bicycle to move backwards (negative speed) as fast as -10.
    If braking value decreases speed to -11 or lower, it should not allow to brake and print out a message saying that value is too high and suggest the highest possible value to use to brake a mountain bike.
    Braking value cannot be negative number.
    If number is negative print a message that it is negative and suggest using positive numbers.
    If everything passes mountain bike’s speed should be successfully decreased.
    Current speed must be printed after it was changed.

•	MountainBike speedUp()
    should allow only positive numbers.
    If negative numbers are supplied print a message saying it is negative and suggest using positive numbers.
    Mountain bike can achieve maximum speed of 100.
    If increasing, its speed makes it over 100 do not increase speed and print a message saying that speed is too high
    and suggest the highest possible increment it can be increased.
    If everything passes increase mountain bike speed and print, it’s new speed.

•	MountainBike changeGear() –
    gear can only be increased or decreased by only 1 or -1.
    If anything, other than 1 or -1 is supplied print a message saying that value is not allowed and
    suggest using 1 or -1.
    Mountain bike gear can not be negative.
    Lowest allowed gear is 0 highest allowed gear is 20.
    If gear change brakes these limits print a message saying that it was either over the max 20 or below 0.
    If everything passes print out new mountain bike gear.

 */