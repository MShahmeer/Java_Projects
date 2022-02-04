/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author Muhammad Shameer
 */
public class Test2 {

    public static void main(String[] args) {
        TollBooth booth = new RaviTollBooth();
        TollBooth booth2 = new IslamabadTollBooth();

        int numberOfAxels = 0;
        double totalWeight = 0.0;
        String name = null;

        for (int i = 0; i < args.length; i++) {
            String[] inputArray = args[i].split(":");
            
            numberOfAxels = Integer.parseInt(inputArray[2]);
            totalWeight = (double) Integer.parseInt(inputArray[3]);

            if (inputArray[0].equals("1")) {
                name = "Ford";
                TollBooth.getTruck().add(new FordTruck(numberOfAxels, totalWeight));
            } else if (inputArray[0].equals("2")) {
                name = "Nisaan";
                TollBooth.getTruck().add(new NissanTruck(numberOfAxels, totalWeight));
            } else if (inputArray[0].equals("3")) {
                name = "Daewoo";
                TollBooth.getTruck().add(new DaewooTruck(numberOfAxels, totalWeight));
            }
        }
        
        System.out.println("At Ravi Toll Booth");
        for (int i = 0; i < args.length; i++) {
            booth.arrived(TollBooth.getTruck().get(i));
        }
        booth.displayData();
        
        System.out.println("At Islamabad Toll Booth");
        for (int i = 0; i < args.length; i++) {
            booth2.arrived(TollBooth.getTruck().get(i));
        }
        booth2.displayData();

    }
}
