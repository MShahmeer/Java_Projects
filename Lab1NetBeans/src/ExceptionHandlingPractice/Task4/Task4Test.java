/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice.Task4;

import java.util.Scanner;

/**
 *
 * @author Muhammad Shameer
 */
public class Task4Test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double side1=0,side2=0,side3=0;
        
        System.out.print("Enter side 1: ");
        side1 = input.nextDouble();
        
        System.out.print("Enter side 2: ");
        side2 = input.nextDouble();
        
        System.out.print("Enter side 3: ");
        side3 = input.nextDouble();
        
        try{
            Triangle triangle = new Triangle(side1,side2,side3);    
        }catch(IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
