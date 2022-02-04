/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_task114;

/**
 *
 * @author Muhammad Shameer
 */
public class Adress {
    private String streetAdress;
    private String cityName;
    private String countryName;
    private PhoneNumber phoneNumber;

    public Adress(String streetAdress, String cityName, String countryName) {
        this.streetAdress = streetAdress;
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
            
}
