/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Shameer
 */
public interface UserService {

    void addUser(User user)throws UserAlreadyExistException;

    void updateUser(User user);

    void deleteUser(int userID);
    
    User getUser(int userID) throws UserAccountIsBlockedException;
    
    void unblockUser(int userID);

    void blockUser(int userID);

    ArrayList<User> getAllUsers();
}
