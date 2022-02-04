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
public class DaewooTruck extends Truck {

    public DaewooTruck(int axels, double weight) {
        super(axels, weight);
    }

    @Override
    public void displayData() {
        System.out.print("Daewoo" + "\t" + "Axels: " + getAxels() + "\t" + "Weight: " + getWeight());
    }

}
