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
public class RaviTollBooth extends TollBooth {

    @Override
    public double calculateTollDue(Truck truck) {
        double tollDue = truck.getAxels() * 5;
        double truckWeight = truck.getWeight() * 0.001;

        if (truckWeight < 30) {
            tollDue = tollDue + truckWeight * 20;
        } else {
            tollDue = tollDue + ((truckWeight / 2) * 5);
        }

        setRecepits(getRecepits() + tollDue);
        return tollDue;
    }

    @Override
    public void displayData() {
        System.out.print("Trucks Arrived: " + getTotalTruckPassed() + "\tReceipts: " + getRecepits());
    }

    @Override
    public void arrived(Truck truck) {
        truck.displayData();
        System.out.println("\tToll Due: " + calculateTollDue(truck));
    }

}
