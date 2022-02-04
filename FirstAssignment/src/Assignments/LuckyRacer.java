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
import java.util.Scanner;
public class LuckyRacer {
    public static void main(String [] args){
	AutomaticCar car1 = new AutomaticCar();
	AutomaticCar car2 = new AutomaticCar();
	AutomaticCar car3 = new AutomaticCar();
	AutomaticCar car4 = new AutomaticCar();
	AutomaticCar car5 = new AutomaticCar();
	
	System.out.println("Enter the Name/Model of the first car");
	Scanner input1 = new Scanner(System.in);
	String car1model = input1.nextLine();
	car1.setModel(car1model);
	
	System.out.println("Enter the Model Year of the first car like 1999 1990 ");
	Scanner input2 = new Scanner(System.in);
	int car1year = input2.nextInt();
	car1.setYear(car1year);
	
	System.out.println("Enter the Model of the second car");
	Scanner input3 = new Scanner(System.in);
	String car2model = input3.nextLine();
	car2.setModel(car2model);
	
	System.out.println("Enter the Model Year of the second car like 1999 1990 ");
	Scanner input4 = new Scanner(System.in);
	int car2year = input4.nextInt();
	car2.setYear(car2year);
	
	System.out.println("Enter the Model of the third car");
	Scanner input5 = new Scanner(System.in);
	String car3model = input5.nextLine();
	car3.setModel(car3model);
	
	System.out.println("Enter the Model Year of the third car like 1999 1990 ");
	Scanner input6 = new Scanner(System.in);
	int car3year = input6.nextInt();
	car3.setYear(car3year);
	
	System.out.println("Enter the Model of the fourth car");
	Scanner input7 = new Scanner(System.in);
	String car4model = input7.nextLine();
	car4.setModel(car4model);
	
	System.out.println("Enter the Model Year of the fourth car like 1999 1990 ");
	Scanner input8 = new Scanner(System.in);
	int car4year = input8.nextInt();
	car4.setYear(car4year);
	
	System.out.println("Enter the Model of the fifth car");
	Scanner input9 = new Scanner(System.in);
	String car5model = input9.nextLine();
	car5.setModel(car5model);
	
    System.out.println("Enter the Model Year of the fifth car like 1999 1990 ");
	Scanner input10 = new Scanner(System.in);
	int car5year = input10.nextInt();
	car5.setYear(car5year);
	
	int s1,s2,s3,s4,s5;// to store the random number
	int temp1=0,temp2=0,temp3=0,temp4=0,temp5=0,temp6=0,temp7=0,temp8=0;// to store the maximum of the distance
        int avg1,avg2,avg3,avg4,avg5; // to store average of the gears used by cars
	System.out.println();
	for(int hour=1; hour<=10; hour++){
	
		s1 = (int) (Math.random()*500);
		car1.setSpeed(s1);
		s2 = (int) (Math.random()*500);
		car2.setSpeed(s2);
		s3 = (int) (Math.random()*500);
		car3.setSpeed(s3);
		s4 = (int) (Math.random()*500);
		car4.setSpeed(s4);
		s5 = (int) (Math.random()*500);
		car5.setSpeed(s5);
		
		car1.setDistance(s1);
		car2.setDistance(s2);
		car3.setDistance(s3);
		car4.setDistance(s4);
		car5.setDistance(s5);
		
		System.out.println("After "+hour+" hour/s");
		System.out.println("The distance travelled by "+car1.getModel()+" "+car1.getYear()+" is "+car1.getDistance()+"km");
		System.out.println("The distance travelled by "+car2.getModel()+" "+car2.getYear()+" is "+car2.getDistance()+"km");
		System.out.println("The distance travelled by "+car3.getModel()+" "+car3.getYear()+" is "+car3.getDistance()+"km");
		System.out.println("The distance travelled by "+car4.getModel()+" "+car4.getYear()+" is "+car4.getDistance()+"km");
		System.out.println("The distance travelled by "+car5.getModel()+" "+car5.getYear()+" is "+car5.getDistance()+"km");
		
		car1.odoMeter = car1.odoMeter + car1.getDistance();//adding distance to the odoMeter to store it
		car2.odoMeter = car2.odoMeter + car2.getDistance();
		car3.odoMeter = car3.odoMeter + car3.getDistance();
		car4.odoMeter = car4.odoMeter + car4.getDistance();
		car5.odoMeter = car5.odoMeter + car5.getDistance();
		
		temp1 = Math.max(car1.getDistance(),car2.getDistance());//calling Math class static method to check maximum value
		temp2 = Math.max(temp1,car3.getDistance());
		temp3 = Math.max(temp2,car4.getDistance());
		temp4 = Math.max(temp3,car5.getDistance());
		
		if (temp4==car1.getDistance())//checking which car has maximum distance to print the model and year of the car
			System.out.println("The leading car rightnow "+car1.getModel()+" "+car1.getYear()+" with distance travelled "+temp4+"km");
		if (temp4==car2.getDistance())
			System.out.println("The leading car rightnow "+car2.getModel()+" "+car2.getYear()+" with distance travelled "+temp4+"km");
		if (temp4==car3.getDistance())
			System.out.println("The leading car rightnow "+car3.getModel()+" "+car3.getYear()+" with distance travelled "+temp4+"km");
		if (temp4==car4.getDistance())
			System.out.println("The leading car rightnow "+car4.getModel()+" "+car4.getYear()+" with distance travelled "+temp4+"km");
		if (temp4==car5.getDistance())
			System.out.println("The leading car rightnow "+car5.getModel()+" "+car5.getYear()+" with distance travelled "+temp4+"km");
		
		car1.averageOfTotalGear = car1.averageOfTotalGear + car1.getGear();
		car2.averageOfTotalGear = car2.averageOfTotalGear + car2.getGear();
		car3.averageOfTotalGear = car3.averageOfTotalGear + car3.getGear();
		car4.averageOfTotalGear = car4.averageOfTotalGear + car4.getGear();
		car5.averageOfTotalGear = car5.averageOfTotalGear + car5.getGear();		
	    System.out.println();
	}
	System.out.println();
	avg1 = car1.averageOfTotalGear/5;// We know total number of gears are 5
	avg2 = car2.averageOfTotalGear/5;
	avg3 = car3.averageOfTotalGear/5;
	avg4 = car4.averageOfTotalGear/5;
	avg5 = car5.averageOfTotalGear/5;
        temp5 = Math.max(car1.odoMeter,car2.odoMeter);//calling Math class static method to check maximum value
        temp6 = Math.max(temp5,car3.odoMeter);
	temp7 = Math.max(temp6,car4.odoMeter);
	temp8 = Math.max(temp7,car5.odoMeter); 
        if (temp8==car1.odoMeter)//checking which car has maximum distance to print the model and year of the car
			System.out.println("The Winner is "+car1.getModel()+" "+car1.getYear()+" with distance travelled "+temp8+"km With average number of gears ="+avg1);
	if (temp8==car2.odoMeter)
			System.out.println("The Winner is "+car2.getModel()+" "+car2.getYear()+" with distance travelled "+temp8+"km With average number of gears ="+avg2);
	if (temp8==car3.odoMeter)
			System.out.println("The Winner is "+car3.getModel()+" "+car3.getYear()+" with distance travelled "+temp8+"km With average number of gears ="+avg3);
	if (temp8==car4.odoMeter)
			System.out.println("The Winner is "+car4.getModel()+" "+car4.getYear()+" with distance travelled "+temp8+"km With average number of gears ="+avg4);
	if (temp8==car5.odoMeter)
			System.out.println("The Winner is "+car5.getModel()+" "+car5.getYear()+" with distance travelled "+temp8+"km With average number of gears ="+avg5);
		
	
}
}
