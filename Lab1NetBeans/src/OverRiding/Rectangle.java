/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverRiding;

/**
 *
 * @author Muhammad Shameer
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length, String colour) {
        super(colour);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+width); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
    
    
}
