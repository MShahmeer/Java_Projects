/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.Task3;

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
public class TestTask3 {

    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;

    static Employee e1 = new Employee(100, "Ali", true, "Permanent");
    static Employee e2 = new Employee(200, "Tooba", false, "visiting");
    static Employee e3 = new Employee(300, "Ahmad", true, "ContractBase");

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/ems", "root", "21f7f498");
            statement = connection.createStatement();
            resultSet = null;
        } catch (SQLException ex) {
            Logger.getLogger(TestTask3.class.getName()).log(Level.SEVERE, null, ex);
        }

        e1 = new Employee(100, "Ali", true, "Permanent");
        e2 = new Employee(200, "Tooba", false, "visiting");
        e3 = new Employee(300, "Ahmad", true, "ContractBase");

        addEmployee(e1);
        printEmployee();
        addEmployee(e2);
        printEmployee();
        addEmployee(e3);
        printEmployee();

        searchEmployees(e1);
        searchEmployees(e2);
        searchEmployees(e3);

        deleteEmployee();
        printEmployee();
    }

    static void addEmployee(Employee employee) {
        int gender = 0;

        if (employee.isGender()) {
            gender = 1;
        }

        try {
            statement.executeUpdate("insert into employees (id,name,gender,type) values('" + employee.getId() + "','" + employee.getName() + "','" + gender + "','" + employee.getType() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(TestTask3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void printEmployee() {
        try {
            resultSet = statement.executeQuery("select * from employees");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Gender: " + resultSet.getBoolean("gender"));
                System.out.println("Type: " + resultSet.getString("type"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestTask3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    static void deleteEmployee() {
        try {
            statement.executeUpdate("delete from employees where name = Ali");
        } catch (SQLException ex) {
            Logger.getLogger(TestTask3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void searchEmployees(Employee employee) {

        try {

            resultSet = statement.executeQuery("select * from employees");
            while (resultSet.next()) {
                if (employee.getId() == resultSet.getInt("id") && resultSet.getString("type").equals("Parmanent")) {
                    System.out.println("ID: " + resultSet.getInt("id"));
                    System.out.println("Name: " + resultSet.getString("name"));
                    System.out.println("Gender: " + resultSet.getBoolean("gender"));
                    System.out.println("Type: " + resultSet.getString("type"));
                } else {
                    System.out.println("Employee is Permanent");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(TestTask3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    static void updateEmployee() {
        try {
            statement.executeUpdate("update employees set type = Parmanent where name = Tooba");
        } catch (SQLException ex) {
            Logger.getLogger(TestTask3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
