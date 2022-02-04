/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Shameer
 */
public class DbUserService implements UserService {

    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;
    

    public static Connection getConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/infosys", "root", "21f7f498");
            return connection;
        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;

    }

    public static Statement getStatement() {
        try {
            statement = getConnection().createStatement();
            return statement;
        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return statement;
    }

    @Override
    public void addUser(User user) throws UserAlreadyExistException {
        
        int status =0;
        if (user.isStatus()) {
            status = 1;
        }

        String addUser = "Insert INTO users (id,name,status) VALUES('" + user.getId() + "',"
                + "'" + user.getName() + "','" + status + "' )";

        try {
            if (getStatement().executeQuery("select id,name,status from users where id = '" + user.getId() + "' ").next()) {
                throw new UserAlreadyExistException(user.getId());
            }
            getStatement().executeUpdate(addUser);
        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void deleteUser(int userID) {
        try {
            getStatement().executeUpdate("delete from users where id = "+ userID);
            System.out.println("Done");
        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User getUser(int userID) throws UserAccountIsBlockedException {
        User u = null;

        try {

            resultSet = getStatement().executeQuery("Select id,name,status from users where id =" + userID );

            while (resultSet.next()) {

                if (!resultSet.getBoolean("status")) {
                    throw new UserAccountIsBlockedException(userID);
                }
                u = new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getBoolean("status"));
                return u;  
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    @Override
    public void blockUser(int userID) {
        try {
            getStatement().executeUpdate("update users set status =" + 0 + " where id = " + userID + " ");
            System.out.println("Done");
        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void unblockUser(int userID) {
        try {
            getStatement().executeUpdate("update users set status =" + 1 + " where id = " + userID );
            System.out.println("Done");
        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void updateUser(User user) {
        
        int status =0;
        if (user.isStatus()) {
            status = 1;
        }

        try {
            getStatement().executeUpdate("update users set name = '" + user.getName() + "' , status = '" + status + "' where id = " + user.getId());
        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<User> getAllUsers() {
        ArrayList<User> user = new ArrayList<>();
        try {
            resultSet = getStatement().executeQuery("SELECT * FROM infosys.users");

            while (resultSet.next()) {
                
                user.add(new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getBoolean("status")));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbUserService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

}
