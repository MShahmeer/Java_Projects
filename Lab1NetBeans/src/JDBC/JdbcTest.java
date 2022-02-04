/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Shameer
 */
public class JdbcTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection connection = null;
        Statement statment = null;
        ResultSet resultSet = null;

        try {
            // TODO code application logic here
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sms", "root", "21f7f498");
            statment = connection.createStatement();
            resultSet = statment.executeQuery("SELECT * FROM students");

            while (resultSet.next()) {
                System.out.print("ID: "+resultSet.getInt("id"));
                System.out.print(" Name: " + resultSet.getString("name"));
                System.out.print(" Email: " + resultSet.getString("email"));
                System.out.print(" Gender: " + resultSet.getString("gender"));
                System.out.print(" Status: " + resultSet.getBoolean("status"));
                System.out.println(" ");
            }

        } catch (SQLException ex) {
            Logger.getLogger(JdbcTest.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                connection.close();
                resultSet.close();
                statment.close();
            } catch (SQLException ex) {
                Logger.getLogger(JdbcTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

}
