/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.terminal;

/**
 *
 * @author Muhammad Shameer
 */
public class Customer extends Person  {
    private String email;
    private int id;
    private MemberShip memberShip;

    public Customer(String email, int id, MemberShip memberShip, String name, String contactNumber, String adress, Gender gender) {
        super(name, contactNumber, adress, gender);
        this.email = email;
        this.id = id;
        this.memberShip = memberShip;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public MemberShip getMemberShip() {
        return memberShip;
    }

    @Override
    public String toString() {
        return super.toString()+" ID: "+getId()+" Email: "+getEmail()+" MemberShip: "+getMemberShip();
    }
    
    
    
    
}
