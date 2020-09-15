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

public class TestShape {

    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(1.25, 236),
            new Rectangle(15, 36),
            new Circle(326),
            new Circle(15),
        };

        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                System.out.println(
                    "Rectangle area: " + ((Rectangle) s).getArea()
                );
                System.out.println(
                    "Rectangle perimeter: " + ((Rectangle) s).getPerimeter()
                );
            } else if (s instanceof Circle) {
                System.out.println("Circle area: " + ((Circle) s).getArea());
                System.out.println(
                    "Circle circumference: " + ((Circle) s).getCircumference()
                );
            }
        }
    }
}
