/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDICAL_STORE_MANAGEMENT_SYSTEM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Muhammad Shameer
 */
public class Test {

    Scanner input = new Scanner(System.in);

    Medicine medicine;
    MedicalStore medicalStore;
    DataBaseAgain dataBase = new DataBaseAgain();
    ResultSet resultSet;
    Connection connection;
    PreparedStatement preparedStatement;

    public static void main(String[] args) {
        MedicalStore clinix = new MedicalStore();
        System.out.print("Store Name: " + clinix.getName());
        System.out.print("      Contact Number: " + clinix.getContactNumber());
        System.out.println("      Adress: " + clinix.getAdress());

        Test test = new Test();
        while (true) {
            System.out.print("\nEnter Password: ");

            Scanner input = new Scanner(System.in);
            String enterPassword = input.nextLine();

            try {
                clinix.setPassword(enterPassword);
                test.userLogin();
                break;
            } catch (WrongPasswordException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public void userLogin() {
        Test test = new Test();
        System.out.println("Enter \n1 to login as Shahmeer\n2 to login as Bashara\n3 to login as Kiran ");
        System.out.print("Please Enter: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {

            while (true) {
                try {
                    User shahmeer = new UserShahmeer();
                    System.out.print("Enter your Password: ");
                    String password = input.nextLine();
                    shahmeer.setPassword(password);
                    if (shahmeer instanceof UserShahmeer) {
                        UserShahmeer uShahmeer = new UserShahmeer();
                        uShahmeer.visitingUser(shahmeer);
                    }
                    System.out.println("<<<< Login as >>>> ");
                    System.out.println(shahmeer.toString());
                    test.start();
                    break;
                } catch (WrongPasswordException ex) {
                    System.out.println(ex.getMessage());
                }

            }

        } else if (choice == 2) {
            while (true) {
                try {
                    User bashara = new UserBashara();
                    System.out.print("Enter your Password: ");
                    String password = input.nextLine();
                    bashara.setPassword(password);
                    if (bashara instanceof UserBashara) {
                        UserBashara uBashara = new UserBashara();
                        uBashara.permanentUser(bashara);
                    }
                    System.out.println("<<<< Login as >>>> ");
                    System.out.println(bashara.toString());
                    test.start();
                    break;
                } catch (WrongPasswordException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        } else if (choice == 3) {
            while (true) {
                try {
                    User kiran = new UserKiran();
                    System.out.print("Enter your Password: ");
                    String password = input.nextLine();
                    kiran.setPassword(password);
                    if (kiran instanceof UserKiran) {
                        UserKiran uKiran = new UserKiran();
                        uKiran.permanentUser(kiran);
                    }
                    System.out.println("<<<< Login as >>>> ");
                    System.out.println(kiran.toString());
                    test.start();
                    break;
                } catch (WrongPasswordException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
    }

    public void start() {

        System.out.println("Enter \n1 to search medicine\n2 to search company medicines\n3 to delete medicine"
                + "\n4 to delete company\n5 to update price\n6 to add medicine\n"
                + "8 to show all stock");
        System.out.print("Please Enter: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {

            System.out.print("Enter Medicine Name: ");
            String medicineName = input.nextLine();

            System.out.print("Enter Company Name: ");
            String companyName = input.nextLine();

            dataBase.searchMedicine(medicineName, companyName);

        } else if (choice == 2) {

            System.out.println("Enter Company Name: ");
            String name = input.nextLine();

            dataBase.searchCompanyMedicine(name);
        } else if (choice == 3) {

            System.out.println("Enter ID: ");
            int id = input.nextInt();

            dataBase.deleteMedicine(id);

        } else if (choice == 4) {

            System.out.println("Enter ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter Company Name: ");
            String companyName = input.nextLine();

            dataBase.deleteCompany(id, companyName);
        } else if (choice == 5) {

            System.out.println("Enter ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter New Price: ");
            double price = input.nextDouble();

            dataBase.updatePrice(id, price);

        } else if (choice == 6) {

            System.out.print("Enter Medicine Name: ");
            String medicineName = input.nextLine();

            System.out.print("Enter Price: ");
            double price = input.nextFloat();
            input.nextLine();

            System.out.print("Enter Company Name: ");
            String companyName = input.nextLine();

            System.out.print("Enter Company Adress: ");
            String companyAdress = input.nextLine();

            System.out.print("Enter Company Email: ");
            String companyEmail = input.nextLine();

            dataBase.add(new Medicine(medicineName, price), new Company(companyName, companyAdress, companyEmail));

        } else if (choice == 8) {

            dataBase.showStock();

        }
    }
}
