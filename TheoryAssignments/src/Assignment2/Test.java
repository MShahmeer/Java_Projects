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
public class Test {

    public static void main(String[] args) {
        TollBooth raviBooth = new RaviTollBooth();
        TollBooth islamabadBooth = new IslamabadTollBooth();
        int axels;
        double weight;
        for (int i = 0; i < args.length; i++) {
            axels = Integer.parseInt(args[i].substring(2, args[i].lastIndexOf("-")));
            weight = (double) Integer.parseInt(args[i].substring(args[i].lastIndexOf("-")+1,args[i].length()));
            if (args[i].substring(0, 1).equals("1")) {
                TollBooth.getTruck().add(new FordTruck(axels, weight));
            }else if(args[i].substring(0, 1).equals("2")){
                TollBooth.getTruck().add(new NissanTruck(axels,weight));
            }else if(args[i].substring(0, 1).equals("3")){
                TollBooth.getTruck().add(new DaewooTruck(axels, weight));
            }
        }
        
        System.out.println("************ Ravi Toll Booth ************");
        for (int i = 0; i < args.length; i++) {
            
            raviBooth.arrived(TollBooth.getTruck().get(i));
            
        }
        raviBooth.displayData();
        System.out.println();
        
        System.out.println("********** Islamabad Toll Booth **********");
        for (int i = 0; i < args.length; i++) {
            
            islamabadBooth.arrived(TollBooth.getTruck().get(i));
            
        }
        islamabadBooth.displayData();
    }
}
