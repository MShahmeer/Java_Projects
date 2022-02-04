/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice.Task4;

/**
 *
 * @author Muhammad Shameer
 */
public class IllegalTriangleException extends Exception {
    
    private double side;

    public IllegalTriangleException(double side) {
        this.side = side;
    }
    
    
    public String getMessage(){
        return side+" is larger than other two sides combined";
    }
}
