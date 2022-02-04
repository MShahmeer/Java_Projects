/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author Muhammad Shameer
 */
public class OutPut {
    static Student st = new Student ("Emma");
    public static void main(String [] args){
        Student st = new Student("Vera");
        OutPut ts =new OutPut();
        ts.st=st;
        ts.st.change(st);
        System.out.print(st.name + ", ");
        System.out.println(new OutPut().st.name);
    }
}
class Student{
    String name;
    public Student  (String name){
      this.name= name;  
    }
    public void change(Student student){
        student = new Student("David");
    }
}
