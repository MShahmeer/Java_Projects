/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Shameer
 */
public class labtask1 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statment = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sms", "root", "21f7f498");
            statment = connection.createStatement();
            resultSet = statment.executeQuery("Select * from students");

            while (resultSet.next()) {
                System.out.print("ID: "+resultSet.getInt("id"));
                System.out.print(" Name: "+resultSet.getString("name"));
                System.out.print(" Gender: "+resultSet.getString("gender"));
                System.out.print(" Email: "+resultSet.getString("email"));
                System.out.println(" ");

            }

        } catch (SQLException ex) {
            Logger.getLogger(labtask1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
