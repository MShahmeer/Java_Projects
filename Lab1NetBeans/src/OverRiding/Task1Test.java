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
import java.util.Scanner;
public class Task1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the colour of the Circle: ");
        String colourC = input.nextLine();
        
        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();
        
        System.out.print("Enter Colour of the Rectangle: ");
        String colourR = input.nextLine();
        
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        
        System.out.print("Enter Width: ");
        double width = input.nextDouble();
        
        Circle circle = new Circle(radius, colourC);
        Rectangle rectangle = new Rectangle(width,length,colourR);
        
        System.out.println("Colour of the Cicle: "+circle.getColour());
        System.out.println("Area of the Circle:"+circle.calculateArea());
        System.out.println("Perimeter of the circle: "+circle.calculatePerimeter());
        
        
        System.out.println("Colour of the Rectangle: "+rectangle.getColour());
        System.out.println("Area of the Rectangle: "+rectangle.calculateArea());
        System.out.println("Perimeter of the Rectangle: "+rectangle.calculatePerimeter());
        
    }
}
