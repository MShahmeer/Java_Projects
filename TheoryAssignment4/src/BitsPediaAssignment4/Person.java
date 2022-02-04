/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitsPediaAssignment4;

/**
 *
 * @author Muhammad Shameer
 */
public class Person {
    private String name;
    private String gender;
    private String city;
    private int age;
    private int id;

    public Person(String name, String gender, String city, int age, int id) {
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
    
    
}
