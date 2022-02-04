/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICAL_STORE_MANAGEMENT_SYSTEM;

/**
 *
 * @author Muhammad Shameer
 */
public abstract class User {

    private String email;
    private String name;
    private String city;
    private String contactNumber;
    private String password;
    private String userCategory;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setPassword(String password) throws WrongPasswordException {
        this.password = password;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    @Override
    public String toString() {
        return  "Name: " + getName() + "\nEmail: " + getEmail() + "\nCity: " + getCity() + "\nContact: " + getContactNumber() + "\nCategory: " + getUserCategory();
    }

    
    
    
    
}
