/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2new;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.ArrayList;

public abstract class TollBooth {

    private double recepits;
    private static ArrayList<Truck> trucks = new ArrayList<>();

    public static ArrayList<Truck> getTrucks() {
        return trucks;
    }

    public void setRecepits(double recepits) {
        this.recepits = recepits;
    }

    public int getTotalTruckPassed() {
        return trucks.size();
    }

    public double getRecepits() {
        return recepits;
    }

    public abstract double calculateTollDue(Truck truck);

    public abstract void displayData();

    public abstract void arrived(Truck truck);

}
