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
public class PhoneNumber {
    private String countryCode;
    private String cityCode;
    private String lineNumber;

    public PhoneNumber(String countryCode, String cityCode, String lineNumber) {
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.lineNumber = lineNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getLineNumber() {
        return lineNumber;
    }
    
    
}
