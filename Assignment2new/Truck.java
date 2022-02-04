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
public abstract class Truck {

    private int axels;
    private double weight;

    public Truck(int axels, double weight) {
        this.axels = axels;
        this.weight = weight;
    }

    public int getAxels() {
        return axels;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void displayData();
}
