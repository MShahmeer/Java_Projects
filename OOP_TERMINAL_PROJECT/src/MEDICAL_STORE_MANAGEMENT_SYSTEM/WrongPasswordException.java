/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICAL_STORE_MANAGEMENT_SYSTEM;

/**
 *
 * @author Muhammad Shameer
 */
public class WrongPasswordException extends Exception{

    @Override
    public String getMessage() {
        return "You entered wrong password";
    }
    
}
