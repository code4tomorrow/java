package com.codefortomorrow.advanced.chapter15.practice;

/*
Create class Square and class Triangle
that implement the interface Shape.
In the sides method, explain how many sides each shape has.
Ex.  “I have ___ sides!”
 */


public class ShapeProblem {
    public static void main(String[] args) {
        Square square = new Square();
        square.sides();
        Triangle triangle = new Triangle();
        triangle.sides();
    }
}

interface Shape {
    public abstract void sides();
}
class Square implements Shape {
    public void sides() {
        System.out.println("I have four sides!");
    }
}
class Triangle implements Shape {
    public void sides() {
        System.out.println("I have three sides!");
    }
}
