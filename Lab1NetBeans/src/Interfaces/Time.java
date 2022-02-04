/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Muhammad Shameer
 */
public class Time implements Ticker{
    private int second;
    private int minutes;
    private int hours;

    public Time(int second, int minutes, int hours) {
        this.second = second;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public void tick() {
       
        if (getSecond() == 60) {
            setSecond(0);
        }
        else{
            setSecond(second++);
        }
        
        if (getMinutes() ==60) {
            setMinutes(0);
        }
        else {
            setMinutes(minutes++);
        }
        
        if (getHours() == 24) {
            setHours(0);
        }
        else{
            setHours(hours++);
        }
    }
    
    

    @Override
    public String toString() {
        return "Time{" + "second=" + second + ", minutes=" + minutes + ", hours=" + hours + '}';
    }
    
    
}
