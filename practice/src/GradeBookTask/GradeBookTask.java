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
public class GradeBookTask {
  private String courseName;
  private int [][] grade;
  
  public void setCourseName(String courseName){
    this.courseName = courseName;
  }
  
  public String getCourseName(){
    return courseName;
  }
  
  public void setGrades(int [][] grade){
   this.grade = grade;
  }
  public int[][] getGrades(){
   return grade;
  }
  
  int max;
  int lastMax;
  public int getMaximumTest(int test){
    int store = 0;
    for(int i=0; i<grade.length; i++){
		 
        grade[i] = new int[test];
        for(int j=0; j<grade[i].length; j++){
	    max = grade[i].length;
            if(Math.max(max,lastMax)>lastMax){
                store =i;
            }
            lastMax = grade[i].length;
	}
    }
    return store;
  }
  
  
  public int getAverageMaximumMarks(int test){
    int max=0;
    int indivisualMarks =0;
    for (int i=0; i<grade.length; i++){
		
        grade[i] = new int[test];
	for(int j=0; j<grade[i].length; i++){
	    indivisualMarks += grade[i][j];
	    max = Math.max(max,indivisualMarks);
	}
    }
    return max;
  }
  
  public int getAverageMarksOfClass(int test){
    int indivisualMarks =0;
    int classMax =0;
    int [] classAverage = new int[grade.length];
    for(int i=0; i<grade.length; i++){
		 
        grade[i] = new int [test];
	for(int j=0; j<grade[i].length; j++){
	    classAverage[j] =( indivisualMarks += grade[i][j]);
	}
    }
     
    for(int i=0;i<classAverage.length;i++){
	classMax = Math.max(classMax , classAverage[i]);
    }
	  
    return classMax/grade.length;
  }
  
  public int getMinimumMarksOfEachStudent(int test){
    int min = grade[0][0];
    for (int i =0; i<grade.length; i++){
		  
        grade[i] = new int[test];
	for(int j=0; j<grade[i].length; i++){
	    min = Math.min(min,grade[i][j]);
	}
    }
    return min;
	  
  }
  
  public int getMaximumMarks(int test){
    int max=0;
    for (int i =0; i<grade.length; i++){
	
        grade[i] = new int [test];
	for(int j=0; j<grade[i].length; i++){
	    max = Math.max(max,grade[i][j]);
	}
    }
    return max;
  }
}
