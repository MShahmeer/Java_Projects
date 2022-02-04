/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanaceTask;

/**
 *
 * @author Muhammad Shameer
 */
public class Person {
    private String name;
    private Adress adress;

    public Person(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }
        
}
