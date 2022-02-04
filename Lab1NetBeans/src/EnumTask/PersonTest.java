/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTask;

/**
 *
 * @author Muhammad Shameer
 */
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("orignal: "+Person.Altaf.getCompanyName());
        Person.Altaf.setCompanyName("Fatima Fertilizer");
        System.out.println("After Changing: "+Person.Altaf.getCompanyName());
    }
}
