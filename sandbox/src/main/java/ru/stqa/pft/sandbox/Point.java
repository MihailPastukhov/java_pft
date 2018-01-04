package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public boolean isEqual(Point a) {
        return (this.x == a.x) && (this.y == a.y);
    }

    public double distanceToPoint(Point a) {
    /*Method counts distance between two points.
    */
        double dist = 0;
        if (isEqual(a))
            return dist;

        else {
            dist = Math.sqrt(Math.pow((this.x - a.x), 2) + Math.pow((this.y - a.y), 2));
            return dist;
        }
    }

}
