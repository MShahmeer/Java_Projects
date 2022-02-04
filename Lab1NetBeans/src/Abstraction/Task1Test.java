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
import java.util.Scanner;

public class Task1Test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Shape[] shape =  new Shape[4];
        
        shape[0] = new Circle(2,"Red",true);
        shape[1] = new Rectangle(15,50,"Purple",false);
        shape[2] = new Circle(3,"Orange",false);
        shape[3] = new Rectangle(13,55,"Yellow",true);
        
        System.out.print("Enter the choice, 1 for circle, 2 for rectangle: ");
        int choice = input.nextInt();
        
            for (int i = 0; i < shape.length; i++) {
                if (shape[i] instanceof Circle && choice == 1) {
                    
                    System.out.print("Enter Radius: ");
                    double radius = input.nextDouble();
                    
                    Circle cirlce = (Circle) shape[i];
                    cirlce.setRadius(radius); 
                }
                
                else if (shape[i] instanceof Rectangle && choice == 2) {
                    
                    System.out.print("Enter the Length: ");
                    double length = input.nextDouble();
                    
                    System.out.print("Enter the Width: ");
                    double width = input.nextDouble();
                    
                    Rectangle rectangle = (Rectangle) shape[i];
                    
                    rectangle.setLength(length);
                    rectangle.setWidth(width);
                }
            }
            
            for (int i = 0; i < shape.length; i++) {   
                System.out.println(shape[i]);
            }
        }
}
