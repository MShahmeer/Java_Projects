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
public class UserKiran extends User implements PermanentUser {

    private String password = "kiran";

    @Override
    public String getContactNumber() {
        return "789456123"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCity() {
        return "Lahore"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return "Kiran"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return "kiran@gmail.com"; //To change body of generated methods, choose Tools | Templates.
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
    public void permanentUser(User user) {
        user.setUserCategory("Permanent User");
    }
}
