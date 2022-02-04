/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.terminal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Shameer
 */
public class DataBase {

    static Connection connection;
    static PreparedStatement preparedStatement;
    static ResultSet resultSet;

    private void makeConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/bankmanagementsystem", "root", "21f7f498");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void displayProduts() {
        try {
            preparedStatement = connection.prepareStatement("select * from products");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Price " + resultSet.getFloat("price"));
                System.out.println("\n\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void displayAllCustomers() {
        try {

            preparedStatement = connection.prepareStatement("select * from customers");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Gender " + resultSet.getString("gender"));
                System.out.println("Conatct " + resultSet.getString("contact"));
                System.out.println("MemberShip " + resultSet.getString("membership"));
                System.out.println("Email " + resultSet.getString("email"));
                System.out.println("Adress " + resultSet.getString("adress"));
                
                System.out.println("\n\n");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void showPremium(){
        try {
            preparedStatement = connection.prepareStatement("select * from customers where membership = ? ");
            preparedStatement.setString(1, "premium");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Gender " + resultSet.getString("gender"));
                System.out.println("Conatct " + resultSet.getString("contact"));
                System.out.println("MemberShip " + resultSet.getString("membership"));
                System.out.println("Email " + resultSet.getString("email"));
                System.out.println("Adress " + resultSet.getString("adress"));
                
                System.out.println("\n\n");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void fetchProducts(int id){
        try {
            preparedStatement = connection.prepareStatement("select * from products where id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Gender " + resultSet.getString("gender"));
                System.out.println("Conatct " + resultSet.getString("contact"));
                System.out.println("MemberShip " + resultSet.getString("membership"));
                System.out.println("Email " + resultSet.getString("email"));
                System.out.println("Adress " + resultSet.getString("adress"));
                
                System.out.println("\n\n");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteGold(){
        try {
            preparedStatement = connection.prepareStatement("delete from customers where membership = ? ");
            preparedStatement.setString(1, "Gold");
            preparedStatement.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void addProduct(int id,String name,double price){
        
        try {
            preparedStatement = connection.prepareStatement("insert into products (? , ? , ?) ");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setDouble(3, price);
            preparedStatement.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void addCustomers(String email, int id, String memberShip, String name, String contactNumber, String adress, String gender){
        
        try {
            preparedStatement = connection.prepareStatement("insert into products (? , ? , ?, ?, ?, ?, ?) ");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, adress);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, memberShip);
            preparedStatement.setString(7, contactNumber);
            preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

}
