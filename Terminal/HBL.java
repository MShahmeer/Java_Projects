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
public class HBL {
    
    private final String name = "HBL";
    private final String contact  = "123456";
    
    ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Bank name: " + name + " Contact: " + contact;
    }
    
    
}
