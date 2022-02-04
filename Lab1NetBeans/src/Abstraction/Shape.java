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
public abstract class Shape {
    private String colour;
    private boolean filled;

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString(){
        return("Shape { Colour = "+getColour()+", Filled "+isFilled()+" }");
    }
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    
    
    
    
}
