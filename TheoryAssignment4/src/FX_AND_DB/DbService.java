/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FX_AND_DB;

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
public class DbService {

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public void setDataBaseConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/persons", "root", "21f7f498");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from persons");

        } catch (SQLException ex) {
            Logger.getLogger(LayOut2Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //static int id = 1;
    public void add(String name, String gender, int age, String city) {
        try {
            statement.executeUpdate("Insert into infosys.persons('name','gender','age','city') "
                    + "values('" + name + "','" + gender + "','" + age + "','" + city + "')");
        } catch (SQLException ex) {
            Logger.getLogger(DbService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Update(){
        
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

}
