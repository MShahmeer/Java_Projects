/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author Muhammad Shameer
 */
public class AutomaticCar {
private String model;
private int year;
private int speed;
private int gear;
public int odoMeter;
private int Distance;
public int averageOfTotalGear;
public int TotalDistance;

public void setModel(String company){
	model = company;
}
public String getModel(){
	return model;
}

public void setYear(int date){
	year = date;
}
public int getYear(){
	return year;
}

public void setSpeed(int carspeed){
	if (carspeed < 0 ){
		System.out.println("The speed can never be less than 0 ");
	}
	else speed = carspeed;
        if ((speed >=1) && (speed<= 100)){
	    gear = 1;
	}	
        else if ((speed >=101) && (speed <= 200)){        
		gear = 2;       	
	}	
        else if ((speed >=201) && (speed <= 300)){        
	        gear = 3;        	
	}
        else if ((speed >=301) && (speed <= 400)){
		gear = 4;
	}	 		
        else if ((speed >=401) && (speed <= 500)){
		gear = 5;
	}
    
}
public int getSpeed(){
	return speed;
}

public int getGear(){ 
	return gear;
}

public void setDistance(int sp){
    Distance = 1 * sp ;// will take the hours from that loop and will mark the distance		
}
public int getDistance(){
	return Distance;
}
}
