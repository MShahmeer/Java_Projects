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
public class UserBashara extends User implements PermanentUser {

    private String password = "bashara";

    @Override
    public String getContactNumber() {
        return "123456789"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCity() {
        return "kharian"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return "Bashara"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return "bashara@gmail.com"; //To change body of generated methods, choose Tools | Templates.
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
