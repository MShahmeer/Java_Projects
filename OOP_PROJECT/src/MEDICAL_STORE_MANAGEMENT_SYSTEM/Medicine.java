/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICAL_STORE_MANAGEMENT_SYSTEM;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Shameer
 */
public class Medicine {
    private int medicineId;
    private String name;
    private double price;
    private static int count;

    public Medicine(String name, double price) {
        count++;
        medicineId = count;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMedicineId() {
        return medicineId;
    }
    
    
    
}
