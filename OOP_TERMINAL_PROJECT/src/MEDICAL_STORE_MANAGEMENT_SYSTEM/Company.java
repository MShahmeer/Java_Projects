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
public class Company {

    private String name;
    private String adress;
    private String email;

    private ArrayList<Medicine> medicines = new ArrayList<>();

    public Company(String name, String adress, String email) {
        this.name = name;
        this.adress = adress;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

}
