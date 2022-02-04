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
public class TestTollBooth {
    public static void main(String[] args) {
        TollBooth raviBooth = new RaviTollBooth();
        TollBooth islamabadBooth = new IslamabadTollBooth();
        
        Truck truck;
        String name;
        int axels = 0;
        double weight = 0.0;
        int toIndex = 0;
        
        //System.out.println(TollBooth.getTruck().);
        
        for (int i = 0; i < args.length; i++) {
            
            axels = Integer.parseInt(args[i].substring(2, args[i].lastIndexOf("-")));
            weight = (double) Integer.parseInt(args[i].substring(args[i].lastIndexOf("-")+1, args[i].length()));
            
            if (args[i].substring(0, 1).equals("1")) {
                name = "Ford";
                truck = new FordTruck(axels,weight);
                System.out.println("***At Ravi Toll Booth***");
                TollBooth.getTruck().add(truck);
                raviBooth.arrived(truck);
                System.out.println();
                raviBooth.displayData();
                System.out.println("\n\n");
                System.out.println("***At Islamabad Toll Booth***");
                TollBooth.getTruck().add(truck);
                islamabadBooth.arrived(truck);
                System.out.println();
                islamabadBooth.displayData();
               
            }
            else if (args[i].substring(0, 1).equals("2")) {
                name = "Nissan";
                truck = new NissanTruck(axels , weight);
                System.out.println("***At Ravi Toll Booth***");
                TollBooth.getTruck().add(truck);
                raviBooth.arrived(truck);
                System.out.println();
                raviBooth.displayData();
                System.out.println("\n\n");
                
                System.out.println("***At Islamabad Toll Booth***");
                TollBooth.getTruck().add(truck);
                islamabadBooth.arrived(truck);
                System.out.println();
                islamabadBooth.displayData();
                
            }
            else if (args[i].substring(0, 1).equals("3")) {
                name =  "Daewoo";
                truck = new DaewooTruck(axels, weight);
                System.out.println("***At Ravi Toll Booth***");
                TollBooth.getTruck().add(truck);
                raviBooth.arrived(truck);
                System.out.println();
                raviBooth.displayData();
                System.out.println("\n\n");
                System.out.println("***At Islamabad Toll Booth***");
                TollBooth.getTruck().add(truck);
                islamabadBooth.arrived(truck);
                System.out.println();
                islamabadBooth.displayData();
                
            }
            
        }
    }
}
