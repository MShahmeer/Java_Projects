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
public class UserShahmeer extends User implements VisitingUser {

    
    private String password = "shahmeer";

    @Override
    public String getContactNumber() {
        return "03120219899"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCity() {
        return "Mianwali"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return "Shahmeer"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return "shahmiraltaf@gmail.com"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) throws WrongPasswordException {
        if (!password.equals(this.password)) {
            throw new WrongPasswordException();
        } else {
            super.setPassword(password);
        }
    }

    @Override
    public void visitingUser(User user) {
        user.setUserCategory("Visiting User");
    }
}
