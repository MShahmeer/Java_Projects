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
public class LABJDBCTEST {
    public static void main(String[] args) {
        
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/bashara", "root", "21f7f498");
            Statement statement = connection.createStatement();
            
            
            //statement.executeUpdate("Insert into lab (r,ac,status) values (10,18,0)");
            statement.executeUpdate("delete from lab where r = 10");
            ResultSet resultSet = statement.executeQuery("select * from lab");
            
            while(resultSet.next()){
                System.out.println("Room no: "+resultSet.getInt("r"));
                System.out.println("Total Ac: "+resultSet.getInt("ac"));
                System.out.println("Status: "+resultSet.getBoolean("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LABJDBCTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
