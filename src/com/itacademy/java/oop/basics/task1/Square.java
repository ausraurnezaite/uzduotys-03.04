package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }

    @Override
    double calculatePerimeter() {
        return this.side * 4;
    }

    @Override
    public String toString() {
        return "Sguare{" +
                "radius= " + this.side +
                " perimeter= " + calculatePerimeter() +
                " area= " + calculateArea() +
                '}';
    }
}
/*
	Create class Square with field side of double type.
 */