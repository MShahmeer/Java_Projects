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
public class Cylinder extends Circle{
    private int height;

    public Cylinder(int height, String colour, int radius) {
        super(colour, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
       
    public double calculateVolume(){
        double volume = (3.14)*(getRadius())*(getRadius())*(height);
        return volume;
    }
    
}
