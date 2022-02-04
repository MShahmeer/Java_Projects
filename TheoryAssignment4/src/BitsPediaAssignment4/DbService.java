/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitsPediaAssignment4;

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

    private void makeConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/persons", "root", "21f7f498");
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DbService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void add(Person person) {
        makeConnection();
        
        try {
            statement.executeUpdate("Insert into infosys.persons('id',name','gender','age','city') "
                    + "values('"+person.getId()+"','" + person.getName() + "','" + person.getGender() + "','" + person.getAge() + "','" + person.getAge() + "')");
            connection.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(FX_AND_DB.DbService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void delete(Person person){
        makeConnection();
        
        try {
            statement.executeUpdate("delete from infosys.persons where id ="+person.getId());
            connection.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet search(){
        makeConnection();
        
        try {
            return resultSet = statement.executeQuery("Select * from infosys.persons");
        } catch (SQLException ex) {
            Logger.getLogger(DbService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }
    
    public void update(Person person){
        makeConnection();
        
        try {
            statement.executeUpdate("update infosys.persons set name ="+person.getName() + ""
                    + "gender = "+person.getGender()+ "city ="+person.getCity()+"age ="+person.getAge()+""
                    + " where id ="+person.getId());
            connection.close();
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
