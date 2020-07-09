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

public class Rectangle extends Shape {
    private double length;
    private double width;

    /** Constructs a default Rectangle with length and width 0 */
    public Rectangle() {
        length = 0;
        width = 0;
    }

    /**
     * Constructs a Rectangle with the
     * given length and width
     * @param length  length of this Rectangle
     * @param width  width of this Rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Constructs a Rectangle with the
     * given length, width, and center (x, y)
     * @param x  x coordinate of the center
     * @param y  y coordinate of the center
     * @param length  length of this Rectangle
     * @param width  width of this Rectangle
     */
    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the length of this Rectangle
     * @return the length of this Rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of this Rectangle
     * to a new value, if the new length
     * is greater than or equal to 0
     * @param length  the new length
     */
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        }
    }

    /**
     * Returns the width of this Rectangle
     * @return the width of this Rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of this Rectangle
     * to a new value, if the new width
     * is greater than or equal to 0
     * @param width  the new width
     */
    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    /**
     * Returns the area of this Rectangle
     * @return the area of this Rectangle
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Returns the perimeter of this Rectangle
     * @return the perimeter of this Rectangle
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
