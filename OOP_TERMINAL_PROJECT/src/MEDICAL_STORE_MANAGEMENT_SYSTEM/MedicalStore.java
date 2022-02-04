/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICAL_STORE_MANAGEMENT_SYSTEM;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Shameer
 */
public class MedicalStore {

    private final String name = "Clinix";
    private final String contactNumber = "04235912797";
    private final String adress = "Ab Para Stop, Wahdat Road";
    
    private final String password = "Semester Project" ;

    ArrayList<Company> company;

    public void setCompany(ArrayList<Company> company) {
        this.company = company;
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

    public ArrayList<Company> getCompany() {
        return company;
    }

    public void setPassword(String password) throws WrongPasswordException{
        if (!password.equals(this.password)) {
            throw new WrongPasswordException();
        }
    }
}
