/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author Muhammad Shameer
 */
public abstract class Truck {
    private int numberOfAxels;
    private double totalWeight;

    public Truck(int numberOfAxels, double totalWeight) {
        this.numberOfAxels = numberOfAxels;
        this.totalWeight = totalWeight;
    }

    public int getNumberOfAxels() {
        return numberOfAxels;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
    
    public abstract void displayData();
}
