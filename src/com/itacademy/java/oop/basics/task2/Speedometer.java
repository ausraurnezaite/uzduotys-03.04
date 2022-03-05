package com.itacademy.java.oop.basics.task2;

public class Speedometer {

    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        int mountainBikeSpeed = mountainBike.getSpeed();
        int roadBikeSpeed = roadBike.getSpeed();
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        } else if (roadBikeSpeed > mountainBikeSpeed) {
            return Bike.ROAD;
        }
        return null;
    }

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) throws LygiosiosException {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        } else if ((roadBikeSpeed > mountainBikeSpeed)) {
            return Bike.ROAD;
        }
        return  null;
    }
}

/*
•	Create a class Speedometer with two static methods:
    Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike)
    Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed)

•	Speedometer chooseWinner() – it should return enum value represting a faster bike.
    It should compare speeds using just the speed values or using objects to get the speed values and comparing them.
    If mountain bike is faster mountain value should be returned and vice versa.

 */