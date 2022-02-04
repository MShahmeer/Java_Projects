/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Shameer
 */
public abstract class TollBooth {
    private double totalWeight;
    private double totalRecepits;
    private static ArrayList<Truck> truck = new ArrayList<>();
    
    public static ArrayList<Truck> getTruck() {
        return truck;
    }

    public void setTotalRecepits(double totalRecepits) {
        this.totalRecepits = totalRecepits;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getTotalTruckPassed() {
        return truck.size();
    }

    public double getTotalRecepits() {
        return totalRecepits;
    }
    
    public abstract double calculateTollDue(Truck truck);
    
    public abstract void displayData();
    
    public abstract void arrived(Truck truck);
    
}
