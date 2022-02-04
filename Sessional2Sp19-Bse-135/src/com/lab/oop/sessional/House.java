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
public class House extends CarbonFootPrintEntity {
    public double area;

    public House(double area) {
        this.area = area;
    }
    
    @Override
    public double getCfc(){
        double CO2 = area * 0.005;
        return CO2;
        
    }
    
}
