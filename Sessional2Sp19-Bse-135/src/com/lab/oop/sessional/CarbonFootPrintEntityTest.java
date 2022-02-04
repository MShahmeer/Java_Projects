/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.oop.sessional;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.*;
public class CarbonFootPrintEntityTest {
    
    public static double getTotalFootPrint(ArrayList<CarbonFootPrintEntity> entities){
        double totalCo2 = 0;
        for (int i = 0; i < entities.size(); i++) {
            totalCo2 = totalCo2 + entities.get(i).getCfc();
        }
        return totalCo2;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        ArrayList<CarbonFootPrintEntity> arrayList = new ArrayList<>();
        
        System.out.print("Enter the Area of the House: ");
        double area = input.nextDouble();
        
        System.out.print("Enter the miles: ");
        double milesTravelled = input.nextDouble();
        
        arrayList.add(new House(area));
        arrayList.add(new Car(milesTravelled));
        
        System.out.println("The total Carbon used is "+CarbonFootPrintEntityTest.getTotalFootPrint(arrayList)+" tones");
        
    }
}
