/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddingTwoBinaryNumbers;

/**
 *
 * @author Muhammad Shameer
 */
public class Constuctor {
    private int id;
    private String StudentName;
    private int Age;
    private String City;
    
    public Constuctor(){
        System.out.println("Empty Constructor");
        
    }
    public Constuctor(int id, String StudentName){
        System.out.println("2 perameter Constructor");
        setId(id);
        setStudentName(StudentName);
    }
     public Constuctor(int id, String StudentName,int Age,String City){
        System.out.println("4 perameter Constructor");
        setId(id);
        setStudentName(StudentName);
        setAge(Age);
        setCity(City);
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setStudentName(String StudentName){
        this.StudentName = StudentName;
    }
    
    public int getId(){
        return id;
    }
    
    public String getStudentName(){
        return StudentName;
    }
    
    public void setAge(int Age){
        this.Age = Age;
    }
    
    public void setCity(String City){
        this.City = City;
    }
    
    public int getAge(){
        return Age;
    }
    public String getCity(){
        return City;
    }
}
