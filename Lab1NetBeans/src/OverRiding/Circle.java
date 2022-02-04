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
public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String colour) {
        super(colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public double calculateArea() {
        return 3.14*radius*radius; 
    }
    
    
}
