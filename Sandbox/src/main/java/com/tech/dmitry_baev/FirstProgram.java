package com.tech.dmitry_baev;

public class FirstProgram {

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point();

        System.out.println("Result is: " + distance(p1, p2));
        System.out.println("Instance method: " + p1.getDistance(p2));
    }
}
