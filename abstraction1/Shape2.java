package com.bitspedia.abstraction1;

// If a class contains one ore more abstract methods, that class must be declared as abstract
// An abstract class may contain some methods which are not abstract

public abstract class Shape2 {
    private String color;

    public Shape2(String color) {
        this.color = color;
    }

    public abstract double calcArea();
    public abstract double calcCircumference();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}