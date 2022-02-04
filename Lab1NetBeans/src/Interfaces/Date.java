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
public class Date implements Ticker{
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void tick() {
        if (getDate() == 30) {
            setDate(1);
        }
        else{
            setDate(date++);
        }
        
        if (getMonth() == 12) {
            setYear(getYear()+1);
            setMonth(1);
            
        }
        else{
            setMonth(month++);
        }
        
    }

    public String toString(){
        return("Date: "+getDate()+":"+getMonth()+":"+getYear());
    }
}
