/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphysim;

/**
 *
 * @author Muhammad Shameer
 */
public class Person {
    private String name;
    private String adres;

    public Person(String name, String adres) {
        setName(name);
        setAdres(adres);     
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", adres=" + adres + '}';
    }
    
    
    
}
