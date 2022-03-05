package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + this.radius +
                " perimeter= " + calculatePerimeter() +
                " area= " + calculateArea() +
                '}';
    }
}
