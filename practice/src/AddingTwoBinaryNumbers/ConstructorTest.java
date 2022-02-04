/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddingTwoBinaryNumbers;

/**
 *
 * @author Muhammad Shameer
 */
public class ConstructorTest {
    public static void main(String [] args){
        Constuctor obj1 = new Constuctor();
        obj1.setId(3);
        obj1.setStudentName("Shahmeer");
        System.out.println("The Student Name is "+obj1.getStudentName()+" The Student Id is "+obj1.getId());
        Constuctor obj2 = new Constuctor(4,"Ahmad");
        System.out.println("The Student Name is "+obj2.getStudentName()+" The Student Id is "+obj2.getId());
        Constuctor obj3 = new Constuctor(75,"Janjooa",20,"Lahore");
        System.out.println("The Student Name is "+obj3.getStudentName()+"\n The Student Id is "+obj3.getId()+"\n The Student Age is "+obj3.getAge()+"\n The Student City is "+obj3.getCity());
    }
}
