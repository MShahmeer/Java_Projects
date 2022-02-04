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
public class NissanTruck extends Truck {

    public NissanTruck(int numberOfAxels, double totalWeight) {
        super(numberOfAxels, totalWeight);
    }

    @Override
    public void displayData() {
        System.out.print("Nissan Truck" + "\t" + "Axels: " + getNumberOfAxels() + "\t" + "Total Weight In Kg: " + getTotalWeight());
    }
}
