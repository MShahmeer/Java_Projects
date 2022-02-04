/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author Muhammad Shameer
 */
public class Circle extends Shape {

    private double radius;
    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    public double getPerimeter(){
        return 3.14*radius;
    }
    
    @Override
    public String toString(){
        return (super.toString()+" Circle { Radius = "+getRadius()+" }");
    }
    
}
