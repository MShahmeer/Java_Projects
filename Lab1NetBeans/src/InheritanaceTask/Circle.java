/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanaceTask;

/**
 *
 * @author Muhammad Shameer
 */
public class Circle {
    
    private String colour;
    private int radius;

    public Circle(String colour, int radius) {
        this.colour = colour;
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public int getRadius() {
        return radius;
    }
    
    public double calculateArea(){
        double area = 2*(3.14)*radius;
        return area;
    }
}
