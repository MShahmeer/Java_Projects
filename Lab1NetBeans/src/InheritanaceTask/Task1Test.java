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
import java.util.*;
public class Task1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Colour: ");
        String colour = input.nextLine();
        
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();
        
        System.out.print("Enter the height: ");
        int height = input.nextInt();
        
        Cylinder obj = new Cylinder(height, colour, radius);
        
        System.out.println("The colur is "+obj.getColour());
        System.out.println("Radius is "+obj.getRadius());
        System.out.println("Height is "+obj.getHeight());
        System.out.println("Area of  Cirlce is "+obj.calculateArea());
        System.out.println("Volume of Cylinder is "+obj.calculateVolume());
        
    }
}
