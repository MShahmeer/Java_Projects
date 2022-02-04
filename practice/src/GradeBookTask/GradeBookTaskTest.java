/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeBookTask;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.Scanner;
public class GradeBookTaskTest {
    public static void main(String [] args){
	  GradeBookTask obj1 = new GradeBookTask();
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter the number of Students:");
	  int student = input.nextInt();
	  System.out.println();
	  obj1.setGrades(new int[student][]);
	  
	  for(int i=0; i<obj1.getGrades().length; i++){
		  
		  System.out.print("Enter the number of test of Student "+(i+1)+" : ");
		  int test = input.nextInt();
		  System.out.println();
		  obj1.getGrades()[i] = new int[test];
		  
		  for(int j=0; j<obj1.getGrades()[i].length; j++){
			  System.out.print("Enter the marks in test "+(j+1)+" : ");
			  obj1.getGrades()[i][j] = input.nextInt();
			  System.out.println();
		  }
	  }
	  
	  int max=0 , maximumTestIndex =0, averageStudent=0, avgMax=0, avgMaximumTestIndex =0, lastAvg=0, averageClass =0;
	  int sumTest=0, totalTestMarks =0, storeLength =0;
	  for(int i=0; i<obj1.getGrades().length; i++){
		  
		  int sumStudent=0, minMarks=0,maxMarks =0;
		  sumTest = sumTest + obj1.getGrades()[i].length;
		  minMarks = obj1.getGrades()[i][0];
		  for (int j=0; j<obj1.getGrades()[i].length; j++){
			  
			  
			  max = Math.max(max,obj1.getGrades()[i].length);
			  
			  //minMarks = obj1.getGrades()[i][j];
			  minMarks = Math.min(minMarks,obj1.getGrades()[i][j]);
			  
			  maxMarks = Math.max(maxMarks,obj1.getGrades()[i][j]);
			  
              if(max > storeLength){
                maximumTestIndex =i;
			  }	
			  
			  storeLength = max;
			  
              sumStudent = sumStudent + obj1.getGrades()[i][j];	
              totalTestMarks = totalTestMarks + obj1.getGrades()[i][j];
		  }
		  
		  averageStudent = sumStudent/obj1.getGrades()[i].length;
		  
		  avgMax = Math.max(avgMax,averageStudent);
		  
		  if(avgMax > lastAvg ){
			  avgMaximumTestIndex = i;
		  }
		  lastAvg = avgMax;
		  
		  System.out.println("The average marks of Student "+(i+1)+" are : "+averageStudent);
		  System.out.println("The Minimum Marks of Student "+(i+1)+" are : "+minMarks);
		  System.out.println("The Maximum Marks of Student "+(i+1)+" are : "+maxMarks);
	  }
	  averageClass =  totalTestMarks/sumTest;
	  System.out.println("Average marks of the class :"+averageClass);
	  System.out.println("The student who has given maximum test is at : "+maximumTestIndex);
	  System.out.println("The maximum average marks is at : "+avgMaximumTestIndex);
	  
  }
}
