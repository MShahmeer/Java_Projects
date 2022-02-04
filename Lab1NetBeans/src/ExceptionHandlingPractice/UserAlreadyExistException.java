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
public class UserAlreadyExistException extends Exception {
    private int id;

    public UserAlreadyExistException(int id){
        this.id = id;
    }
    
    public String getMessage(){
        return "User with id: "+id+" already exists";
    }
    
  
}
