package com.codefortomorrow.intermediate.chapter12.solutions.geometric;

/*
Create 4 classes: TestShape, Shape, Circle, and Rectangle.

Circle and Rectangle extend Shape. TestShape is the driver class.

UML diagrams for Circle, Rectangle, and Shape:

                   Circle
--------------------------------------------
- radius: double
--------------------------------------------
+ Circle()
+ Circle(radius: double)
+ Circle(x: double, y: double, radius: double)
+ getRadius(): double
+ setRadius(radius: double): void
+ getArea(): double
+ getCircumference(): double
+ getDiameter(): double


                 Rectangle
--------------------------------------------
- length: double
- width: double
--------------------------------------------
+ Rectangle()
+ Rectangle(length: double, width: double)
+ Rectangle(x: double, y: double, length: double, width: double)
+ getLength(): double
+ setLength(length: double): void
+ getWidth(): double
+ setWidth(width: double): void
+ getArea(): double
+ getPerimeter(): double


                    Shape
--------------------------------------------
+ x: double
+ y: double
--------------------------------------------
+ Shape()
+ Shape(x: double, y: double)
+ getDistance(s: Shape): double

Note: The x and y fields in the Shape class are the coordinates of the center of the shape.
The getDistance() method returns the distance between this Shape and another Shape s.

In the TestShape class, create an array of Shape objects.
Initialize the array with at least 2 Rectangle objects and 2 Circle objects.
Give them any length/width/radius you want. Using a for each loop,
check if the current Shape is a Rectangle or a Circle.
If it is a Rectangle, print the area and perimeter.
If it is a Circle, print the area and circumference.

Feel free to call other methods on the objects to see
if they work properly! Also, bonus points for Javadoc
comments for all of the methods.
 */

public class Circle extends Shape {

    private double radius;

    /** Constructs a default Circle with radius 0 */
    public Circle() {
        radius = 0;
    }

    /**
     * Constructs a Circle with
     * the given radius
     * @param radius  radius of this Circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructs a Circle with
     * the given radius and center (x, y)
     * @param x  x coordinate of the center
     * @param y  y coordinate of the center
     * @param radius  radius of this Circle
     */
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    /**
     * Returns the radius of this Circle
     * @return the radius of this Circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of this Circle
     * to a new value, if the new radius
     * is greater than or equal to 0
     * @param radius  new radius
     */
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    /**
     * Returns the area of this Circle
     * @return the area of this Circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the circumference of this Circle
     * @return the circumference of this Circle
     */
    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    /**
     * Returns the diameter of this Circle
     * @return the diameter of this Circle
     */
    public double getDiameter() {
        return 2 * radius;
    }
}
