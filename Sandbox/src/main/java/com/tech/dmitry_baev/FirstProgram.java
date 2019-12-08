package com.tech.dmitry_baev;

public class FirstProgram {

    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point();

        System.out.println("Instance method: " + p1.getDistance(p2));
    }
}
