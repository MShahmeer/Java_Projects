/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice;

/**
 *
 * @author Muhammad Shameer
 */
public class UserAccountIsBlockedException extends RuntimeException {
    private int id;
    public UserAccountIsBlockedException(int id) {
        this.id = id;
    }
    
    public String getMessage(){
        return "Account of User with id: "+id+" is Blocked";
    }
    
}
