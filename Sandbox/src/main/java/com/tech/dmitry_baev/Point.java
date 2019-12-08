package com.tech.dmitry_baev;

public class Point {
    private int x;
    private int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    double getDistance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() - this.getY(), 2));
    }
}
