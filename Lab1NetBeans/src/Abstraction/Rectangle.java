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
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
     @Override
    public double getArea(){
        return length*width;
    }
    
    public double getPerimeter(){
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return (super.toString()+" Rectangle { Length = "+getLength()+" Width = "+getWidth()+" }"); //To change body of generated methods, choose Tools | Templates.
    }
  
}
