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
public class IslamabadTollBooth extends TollBooth {

    @Override
    public double calculateTollDue(Truck truck) {
        double truckWeight = truck.getWeight();
        truckWeight = truckWeight * 0.001;
        double tollDue = (truck.getAxels() * 8) + ((truckWeight) * 24);

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
