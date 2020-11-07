package com.codefortomorrow.intermediate.chapter12.examples;

public class TestPoint {

    public static void main(String[] args) {
        Point pt1 = new Point(5, 0);
        Point pt2 = new Point(1.4, -15);

        System.out.println("Point 1: " + pt1); // prints "Point 1: (5, 0)"
        System.out.println("Point 2: " + pt2); // prints "Point 2: (1.4, -15)"

        // the following prints the same distance, demonstrating
        // overloading the getDistance() method
        System.out.println(pt1.getDistance(pt2));
        System.out.println(pt1.getDistance(1.4, -15));
    }
}

class Point {

    public double x;
    public double y;

    /** Constructs a default Point object */
    public Point() {
        x = 0;
        y = 0;
    }

    /**
     * Constructs a Point object with given coordinates (x, y)
     * @param x  x coordinate
     * @param y  y coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the distance between this Point
     * and the given point with coordinates (x, y)
     * @param x  x coordinate of the other point
     * @param y  y coordinate of the other point
     * @return the distance between this Point
     * and the given point with coordinates (x, y)
     */
    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    /**
     * Returns the distance between this Point
     * and the given Point
     * @param pt  the other Point
     * @return the distance between this Point
     * and the given Point
     */
    public double getDistance(Point pt) {
        return getDistance(pt.x, pt.y);
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return (this.x == ((Point) obj).x) && (this.y == ((Point) obj).y);
        }
        return false;
    }
}
