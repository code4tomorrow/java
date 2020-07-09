package com.codefortomorrow.intermediate.chapter12.solutions;

/*
Create a class called Triangle.

Triangle UML:
- side1: double
- side2: double
- side3: double
-----------------------
+ Triangle()
+ Triangle(side1: double, side2: double, side3: double)
+ getArea(): double
+ getPerimeter(): double
+ toString(): String
+ equals(): boolean

Note: Use Heron's Formula to calculate the
area of a triangle given its 3 sides.

Note: 2 triangles are equal if their perimeters
are equal.

Create a driver class called TestTriangle.
In the main method, create 2 identical
triangle objects, triangle1 and triangle2.
Print the result of using the equality operator
on the two objects. Then print the result of
calling triangle1.equals(triangle2).
 */

public class TestTriangle {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(3, 4, 5);
        System.out.println(
            "triangle1 == triangle2: " + (triangle1 == triangle2)
        );
        System.out.println(
            "triangle1.equals(triangle2): " + triangle1.equals(triangle2)
        );
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // calculate the semiperimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return (
            "Triangle with side lengths: " + side1 + " " + side2 + " " + side3
        );
    }

    @Override
    public boolean equals(Object obj) {
        // two Triangles are equal if they have the same perimeter
        if (obj instanceof Triangle) {
            return (this.getPerimeter() == ((Triangle) obj).getPerimeter());
        }
        return false;
    }
}
