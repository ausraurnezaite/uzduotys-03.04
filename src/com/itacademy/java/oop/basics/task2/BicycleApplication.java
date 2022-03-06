package com.itacademy.java.oop.basics.task2;

import java.util.Scanner;

public class BicycleApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MountainBike mountain = new MountainBike();

        mountain.speedUp(15);
        mountain.applyBrakes();
        mountain.speedUp(5);
        mountain.applyBrakes();
        mountain.changeGear(1);
        mountain.changeGear(-1);
        mountain.changeGear(-1);



//        mountain.speedUp();
//        mountain.speedUp();
//        mountain.changeGear();
//        mountain.changeGear();


        RoadBike road = new RoadBike();

        road.speedUp(15);
        road.applyBrakes();
        road.speedUp(5);
        road.applyBrakes();
        road.changeGear(1);
        road.changeGear(-1);
        road.changeGear(-1);

//        road.speedUp();
//        road.speedUp();
//        road.changeGear();
//        road.changeGear();


        Bike winner = Speedometer.chooseWinner(mountain.getSpeed(), road.getSpeed());
        if (winner != null) {
            System.out.println("The winner is: " + winner);
        } else {
            System.out.println("Lygiosios");
        }

        Bike winner2 = Speedometer.chooseWinner(mountain, road);
        if (winner != null) {
            System.out.println("The winner is: " + winner2);
        } else {
            System.out.println("Lygiosios");
        }

    }
}

/*
Task 2
•	Create a package, name: com.itacademy.java.oop.basics.task2
•	Create class BicycleApplication with main method.
•	Create interface Bicycle with methods changeGear(int newGear): void, speedUp(int increment): void (should increase bicycle speed), applyBrakes():void (should decrease bicycle speed).
•	Create classes MountainBike and RoadBike with fields int gear and int speed. They must implement Bicycle interface.
•	Create enum Bike with values mountain and road.
•	Create a class Speedometer with two static methods chooseWinner(MountainBike mountainBike, RoadBike roadBike): Bike and chooseWinner(int mountainBikeSpeed, int roadBikeSpeed): Bike
•	Use all the methods and play around to see if all of the business logic below works as expected.
 */
