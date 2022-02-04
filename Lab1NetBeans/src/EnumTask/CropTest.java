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
import java.util.Scanner;
public class CropTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the crop you want to search :");
        String cropName = input.nextLine();
        
        if(Crop.valueOf(cropName).equals(Crop.Cotton)){
            System.out.println("Place: "+Crop.Cotton.getCityName()+" Distance: "+Crop.Cotton.getDistance()+" Number of Bags: "+Crop.Cotton.getNoOfBags()+" Saled ? "+Crop.Cotton.isSaled());
        } 
           
        else if(Crop.valueOf(cropName).equals(Crop.Wheat)){
            System.out.println("Place: "+Crop.Wheat.getCityName()+" Distance: "+Crop.Wheat.getDistance()+" Number of Bags: "+Crop.Wheat.getNoOfBags()+" Saled ? "+Crop.Wheat.isSaled());
        }
        
        else if (!(Crop.valueOf(cropName).equals(Crop.Wheat))){
            System.out.println("Crop Not Found");
        }

    }
}
