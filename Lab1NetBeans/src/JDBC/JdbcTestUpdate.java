/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Shameer
 */
public class JdbcTestUpdate {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statment = null;

        try {
            // TODO code application logic here
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sms", "root", "21f7f498");
            statment = connection.createStatement();
            int num = statment.executeUpdate("Update students set name ='Umar', email ='umar@gmail.com', gender ='M' where id=2 ");

            System.out.println("Number of rows affected: "+num);
            
        } catch (SQLException ex) {
            Logger.getLogger(JdbcTest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
                statment.close();
            } catch (SQLException ex) {
                Logger.getLogger(JdbcTest.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
