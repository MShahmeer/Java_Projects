package com.bitspedia.inheritance2;

public class Square extends Shape {

    int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * width;
    }

}
