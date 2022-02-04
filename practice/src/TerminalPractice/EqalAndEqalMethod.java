/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerminalPractice;

/**
 *
 * @author Muhammad Shameer
 */
import Quiz.Student2;

public class EqalAndEqalMethod {

    public static void main(String[] args) {
        System.out.println("Students Class");
        Student2 s = new Student2(135, "Shahmeer");
        Student2 s1 = new Student2(135, "Shahmeer");
        Student2 s2 = s;
        System.out.print("By s==s1 >");
        System.out.println(s == s1);

        System.out.print("By .equals() s&s1 ");
        System.out.println(s.equals(s1));

        System.out.print("By s==s2 >");
        System.out.println(s == s2);

        System.out.print("By .equals() s&s2 ");
        System.out.println(s.equals(s2));

        System.out.println("String Class");

        String str1 = new String("Text");
        String str2 = new String("Text");

        System.out.print("str1 == str2 ");
        System.out.println(str1 == str2);

        System.out.print("Str1.equals(str2 )");
        System.out.println(str1.equals(str2));

        String str3 = "Text";
        String str4 = "Text";
        
        System.out.print("str3 ==  str4 ");
        System.out.println(str3 ==  str4);
        
        System.out.print("str3.equals(str4) ");
        System.out.println(str3.equals(str4));
        
        System.out.print("str1  == str4 ");
        System.out.println(str1  == str4 );
        
        System.out.print("str1.equals(str4) ");
        System.out.println(str1.equals(str4));
        
        System.out.print("str1.equals(str3) ");
        System.out.println(str1.equals(str3));
        

    }
}
