package com.csc205.project1;

public class Point {

    private double x,y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt( Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2) );
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y){
        this.x = x;         // setX(x);
        this.y = y;
    }

    public void shiftX(double x){
        this.x = x + this.x;

    }

    public void shiftY(double y){
        this.y = y + this.y;
    }

    public void rotate(double theta){
        double newX = this.x * Math.cos(theta) - this.y * Math.sin(theta);
        double newY = this.x * Math.sin(theta) + this.y * Math.cos(theta);
        this.x = newX;
        this.y = newY;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}



