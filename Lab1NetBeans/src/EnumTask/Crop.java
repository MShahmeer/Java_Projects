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
public enum Crop {
    
    Wheat(200,"Mianwali",true,203.78),
    Cotton(300,"Kundiyan",false,306.79);
    
    private int noOfBags;
    private String cityName;
    private boolean saled;
    private double distance;

    private Crop(int noOfBags, String cityName, boolean saled, double distance) {
        this.noOfBags = noOfBags;
        this.cityName = cityName;
        this.saled = saled;
        this.distance = distance;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public void setNoOfBags(int noOfBags) {
        this.noOfBags = noOfBags;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean isSaled() {
        return saled;
    }

    public void setSaled(boolean saled) {
        this.saled = saled;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    
    
}
