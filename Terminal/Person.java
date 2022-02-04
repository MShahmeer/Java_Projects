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
public abstract class Person {
    
    private String name;
    private String contactNumber;
    private String adress;
    private Gender gender;


    public Person(String name, String contactNumber, String adress, Gender gender) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.adress = adress;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAdress() {
        return adress;
    }

    public Gender getGender() {
        return gender;
    }
    

    @Override
    public String toString() {
        return "name = " + name + " contactNumber =" + contactNumber + " adress = " + adress;
    }
    
    
}
