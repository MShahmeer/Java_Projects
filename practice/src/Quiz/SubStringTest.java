/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Shameer
 */
public class SubStringTest {
    public static ArrayList<String[]> array = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "1-5-12000";
        System.out.println(str);
        System.out.println("0 to 1:  "+str.substring(0,1));
       // System.out.println("2 to 3:  "+str.sub
        System.out.println("4 to str.length():  "+str.substring(4, str.length()));
        
        int store =0;
        for (int i = 0; i < str.length(); i++) {
            
            if (i==1 && str.contains("-")) {
                continue;
            }else if(i>1 && str.contains("-")){
                store = i;
            }
            System.out.println(i+" "+str.substring(i, i+1));
        }
        System.out.println("store"+store);
        System.out.println("length"+str.length());
        System.out.println("Last Index: "+str.lastIndexOf("-"));
        
       // System.out.println(str.split(str));
        String[] str2 =str.split("-");
        array.add(str2);
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
        for (String a : str2) {
            System.out.println(a);
        }
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.get(i).length; j++) {
                System.out.println(array.get(i)[j]);
            }
        }
        
        
        
    }
    
}
