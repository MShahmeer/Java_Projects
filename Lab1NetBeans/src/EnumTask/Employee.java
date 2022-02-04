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
public class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private Gender gender;
    private double bonus;

    public Employee(int id, String name, double basicSalary, Gender gender) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public Gender getGender() {
        return gender;
    }

    public double claculateBonus(){
        if(gender == Gender.Male){
            bonus = basicSalary*0.1;
        }
        else if(gender == Gender.Female){
            bonus = basicSalary*0.2;
        }
        return bonus;
    }
        
        
    
    
}
