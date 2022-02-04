/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.terminal;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Shameer
 */
public abstract class MemberShip  {
    private String startDate;
    private String endDate;
    private ArrayList<Products> products;

    public MemberShip(String startDate, String endDate, ArrayList<Products> products) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.products = products;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    
    public abstract double recieveDiscount(double price);
    
    public double calculateBill(String name,int quantity){
        double totalBill = 0.0;
        for (int i = 0; i < products.size(); i++) {
            if (name.equalsIgnoreCase(products.get(i).getName())) {
                totalBill = totalBill + products.get(i).getPrice();
            }
        }
        return totalBill * quantity;
    }
}
