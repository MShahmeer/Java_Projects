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
public enum Person {
    Altaf(392346,"Agritech Limited",true);
    
    private int phoneNumber;
    private String companyName;
    private boolean isEmployee;

    private Person(int phoneNumber, String companyName, boolean isEmployee) {
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.isEmployee = isEmployee;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }
    
    
    
    
}
