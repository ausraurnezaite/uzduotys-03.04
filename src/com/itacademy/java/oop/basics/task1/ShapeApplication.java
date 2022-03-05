package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {

    public static void main(String[] args) {

        Square sq = new Square(6);
        System.out.println(sq);

        Circle c = new Circle(4);
        System.out.println(c);
    }
}

/*
Task 1
•	Create a package, name: com.itacademy.java.oop.basics.task1
•	Create class ShapeApplication with main method.
•	Create abstract class Shape with abstract methods calculateArea(), calculatePerimeter().
•	Create class Square with field side of double type.
•	Create class Circle with field radius of double type.
•	Circle and Square must extend Shape and implement its methods.
Requirements:
•	Create object for Circle and Square.
•	Use implemented methods to calculate area and perimeter for both objects.
•	Print out response implementing toString()
 */
