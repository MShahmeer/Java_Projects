/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Muhammad Shameer
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String [] wordListOne ={ "Shahmeer", "Ahmad" , "Waheed" , "Arose" , "Uzair" , "Subbyyal" , "Ali" , "Haris" , "Shahzad" , "Haseeb"};
         String [] wordListTwo ={ "Umar", "Adeel","Aqib","Sajjad","Umair","Latif","Imran","Abu Bakar","Ali","Mateen","Inam Ullah","Emran Shahbaz"};
         String [] wordListThree = {"Hassan Ali","Shadab","Misbah Ul Haq","Afridi","Muhammad Amir","Imam Ul Haq","Inzamam Ul Haq","Shahzad Khan","Shaheen Afridi"};
         
         
         
         int oneLength = wordListOne.length;
         int twoLength = wordListTwo.length;
         int threeLength = wordListThree.length;
         
         
         
         int rand1 = (int) (Math.random() * oneLength);
         int rand2 = (int) (Math.random() * twoLength);
         int rand3 = (int) (Math.random() * threeLength);
         
         
         String Phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
         
         System.out.println("The String that we need is "+Phrase);
 
    }
    
}
