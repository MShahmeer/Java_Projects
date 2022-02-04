package com.bitspedia.abstraction1;

public class Circle extends Shape2 {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
