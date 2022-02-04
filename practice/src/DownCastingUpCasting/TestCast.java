/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownCastingUpCasting;

/**
 *
 * @author Muhammad Shameer
 */
public class TestCast {
    public static void main(String[] args) {
        Machine machine = new Camera();
        
        System.out.println("UpCasting");
        machine.start();
        
        if (machine instanceof Camera) {
            Camera camera =(Camera) machine;
            System.out.println("DownCasting");
            camera.start();
            camera.snap();
        }
        
       

    }
}
