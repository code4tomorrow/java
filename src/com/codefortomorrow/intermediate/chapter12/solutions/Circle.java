package com.codefortomorrow.intermediate.chapter12.solutions;

/*
Create the Circle class given a UML diagram.
 */

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 0;
        color = "";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    private double getDiameter() {
        return radius * 2;
    }
}
