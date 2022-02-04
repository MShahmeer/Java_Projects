
package com.bitspedia.inheritance2;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        int area = width * length;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
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