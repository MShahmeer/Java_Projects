/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphysim_Concept;

/**
 *
 * @author Muhammad Shameer
 */
public class MainClass {
    public static void main(String[] args){
        Animal[] thelist = new Animal[3];
        Dog d = new Dog();
        Fish f = new Fish();
        Animal a = new Animal();
        thelist[0] = d;
        thelist[1]=f;
        thelist[2]=a;
        for (Animal x: thelist){
            x.noise();
        }
    }
    
}
