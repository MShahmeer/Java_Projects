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
public class Shape {
    private String colour;

    public Shape(String colour) {
        this.colour = colour;
    }
    
    public double calculateArea(){
        return 0;
    }
    
    public double calculatePerimeter(){
        return 0;
    }

    public String getColour() {
        return colour;
    }
}
