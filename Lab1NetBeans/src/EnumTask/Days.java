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
public enum Days {
    Mon(1),
    Tue(2),
    Wed(3),
    Thurs(4),
    Fri(5),
    Sat(6),
    Sun(7);
    
    private final int noOfDays;
    
    private Days(int noOfDays){
        this.noOfDays = noOfDays;
    }

    public int getNoOfDays() {
        return noOfDays;
    }
    
    
}
