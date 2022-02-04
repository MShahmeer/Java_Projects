/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICAL_STORE_MANAGEMENT_SYSTEM;

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
public class DataBaseAgain {

    Connection connection;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    private void makeConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "21f7f498");

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add(Medicine medicine, Company company) {
        makeConnection();
        try {

            preparedStatement = connection.prepareStatement("Insert into medicines (name,price,cname,cemail,cadress) values (? , ? , ? , ? , ?)");

            preparedStatement.setString(1, medicine.getName());
            preparedStatement.setDouble(2, medicine.getPrice());
            preparedStatement.setString(3, company.getName());
            preparedStatement.setString(4, company.getEmail());
            preparedStatement.setString(5, company.getAdress());
            
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void searchMedicine(String medicineName, String companyName) {
        makeConnection();

        try {

            preparedStatement = connection.prepareStatement("Select * from medicines where name = ? AND cname = ? ");

            preparedStatement.setString(1, medicineName);
            preparedStatement.setString(2, companyName);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") + " Price " + resultSet.getDouble("price") + " Company Name " + resultSet.getString("cname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }

    }

    public void searchCompanyMedicine(String companyName) {
        makeConnection();

        try {

            System.out.println(companyName);
            PreparedStatement ps = connection.prepareStatement("select * from medicines where  cname = ? ");
            ps.setString(1, companyName);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") + " Price: " + resultSet.getFloat("price") + " Company Name " + resultSet.getString("cname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }

    }

    public void updatePrice(int id, double price) {
        makeConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("Update medicines set price = ?  where id = ? ");

            ps.setDouble(1, price);
            ps.setInt(2, id);
            
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void deleteMedicine(int id) {
        makeConnection();

        try {

            preparedStatement = connection.prepareStatement("delete from medicines where id = ? ");
            preparedStatement.setInt(1, id);
           
            
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void deleteCompany(int id, String companyName) {
        makeConnection();

        try {

            preparedStatement = connection.prepareStatement("delete from medicines where id = ? AND cname = ? ");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, companyName);

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void showStock() {
        makeConnection();

        try {
            preparedStatement = connection.prepareStatement("select * from medicines");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Price: " + resultSet.getFloat("price"));
                System.out.println("Company Name: " + resultSet.getString("cname"));
                System.out.println("Company Email: " + resultSet.getString("cemail"));
                System.out.println("Company Adress: " + resultSet.getString("cadress"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            closeConnection();

        }
    }

    public ResultSet completeData() {
        makeConnection();
        try {
            preparedStatement = connection.prepareStatement("select * from medicines");
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }

    public void closeConnection() {
        try {
            if (resultSet != null && connection != null) {
                resultSet.close();
                connection.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseAgain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
