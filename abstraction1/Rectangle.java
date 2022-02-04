package com.bitspedia.abstraction1;

public class Rectangle extends Shape2 {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calcArea() {
        int area = width * length;
        return area;
    }

    @Override
    public double calcCircumference() {
        return 2  * (width + length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
