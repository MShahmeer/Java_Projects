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
public class Silver extends MemberShip{
    public Silver(String startDate, String endDate, ArrayList<Products> products) {
        super(startDate, endDate, products);
    }


    @Override
    public double recieveDiscount(double price) {
        return price * 0.3;
    }
}
