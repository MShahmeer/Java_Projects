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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Shameer
 */
public class DataBase {

    Connection connection;
    Statement statement;
    //ResultSet resultSet;

    private void makeConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "21f7f498");
            statement = connection.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add(Medicine medicine, Company company) {
        makeConnection();
        try {
            statement.executeUpdate("Insert into medicines (id,name,price,cname,cemail,cadress) values('"
                    + medicine.getMedicineId() + "','" + medicine.getName() + "','" + medicine.getPrice() + "','"
                    + company.getName() + "','" + company.getEmail() + "','" + company.getAdress() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void searchMedicine(String medicineName, String companyName) {
        makeConnection();
        ResultSet resultSet = null;

        try {
            resultSet = statement.executeQuery("Select * from medicines where name = ' " + medicineName + "' AND cname = '" + companyName + " '");

            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") + " Company Name " + resultSet.getString("cname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            //closeConnection();
        }

    }

    public void searchCompanyMedicine(String companyName) {
        makeConnection();
        ResultSet resultSet = null;

        try {
            //connection = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "21f7f498");

            System.out.println(companyName);
            //resultSet = statement.executeQuery("select * from medicines where  cname = '" + companyName + " '");
            PreparedStatement ps = connection.prepareStatement("select * from medicines where  cname = ? ");
            ps.setString(1, companyName);
            resultSet = ps.executeQuery();
            //System.out.println(resultSet.next());

            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") + " Price: " + resultSet.getFloat("price") + " Company Name " + resultSet.getString("cname"));;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();

            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            //closeConnection();
        }
        //return null;

    }

    public void updatePrice(int id, double price, String medicineName, String companyName) {
        makeConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("Update medicines set price = ?  where id = ? AND name = ? "
                    + "AND cname =  ?");
            
            ps.setDouble(1, price);
            ps.setInt(2, id);
            ps.setString(3, medicineName);
            ps.setString(4, companyName);
//            statement.executeUpdate("Update medicines set price = " + price + " where id = " + id + " "
//                    + "AND name = " + medicineName + " AND cname = " + companyName);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void deleteMedicine(int id, double price, String medicineName, String companyName) {
        makeConnection();

        try {
            statement.executeUpdate("delete from medicines where id = " + id + " AND name = " + medicineName + " "
                    + "And cname = " + companyName);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void deleteCompany(int id, String companyName) {
        makeConnection();

        try {
            statement.executeUpdate("delete from medicines where id = " + id + " AND cname = '" + companyName + " '");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }
    }

    public void showStock() {
        makeConnection();
        ResultSet resultSet = null;

        try {
            resultSet = statement.executeQuery("select * from medicines");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Price: " + resultSet.getFloat("price"));
                System.out.println("Company Name: " + resultSet.getString("cname"));
                System.out.println("Company Email: " + resultSet.getString("cemail"));
                System.out.println("Company Adress: " + resultSet.getString("cadress"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
                closeConnection();

            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            //closeConnection();
        }

    }

    public void closeConnection() {
        try {
            //resultSet.close();
            connection.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
