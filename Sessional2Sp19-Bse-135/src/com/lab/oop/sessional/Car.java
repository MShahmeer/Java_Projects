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
public class Car extends CarbonFootPrintEntity {
    public double miles;

    public Car(double miles) {
        this.miles = miles;
    }
    
    @Override
    public double getCfc(){
        double CO2 = miles * 0.00029;
        return CO2;
    }
}
