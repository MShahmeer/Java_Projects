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

public class EnumTask {
    public static void main(String[] args) {
         for (Days d : Days.values()) {
             System.out.print(d.getNoOfDays()+" ");
             System.out.println(d);
        }
        
        
    }
}
