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
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecrityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecrityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
        
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s","Employee ",firstName,lastName,"Social Security Number",socialSecurityNumber);
    }
}
