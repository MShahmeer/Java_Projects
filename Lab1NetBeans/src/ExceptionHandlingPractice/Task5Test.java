/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice;

import java.util.Scanner;

/**
 *
 * @author Muhammad Shameer
 */
public class Task5Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InMemoryUserService imus = new InMemoryUserService();

        int id;
        String name;
        boolean status;

        if (imus.getAllUsers().isEmpty()) {
            System.out.print("Enter the number of User you want to add: ");
            int num = input.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("****Enter the data of "+(i+1)+" User to Add****");
                System.out.print("Enter id:");
                id = input.nextInt();
                input.nextLine();

                System.out.print("Enter the name: ");
                name = input.nextLine();

                System.out.print("Enter the status: ");
                status = input.nextBoolean();
                
                try {
                    imus.addUser(new User(id, name, status));
                } catch (UserAlreadyExistException e) {
                    System.out.println(e.getMessage());
                }
            }

        }

        while (true) {
            System.out.println("Enter the action to perform");
            System.out.println("1 to add user \n2 for update user "
                    + "\n3 to delete user \n4 to search user \n5 to block user"
                    + "\n6 to unblock user \n7 to Display all users \n8 to terminate");

            int choice = input.nextInt();

            if (choice == 1) {
                try {
                    System.out.print("Enter id:");
                    id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter the name: ");
                    name = input.nextLine();

                    System.out.print("Enter the status: ");
                    status = input.nextBoolean();

                    imus.addUser(new User(id, name, status));
                } catch (UserAlreadyExistException e) {
                    System.out.println(e.getMessage());
                }

            } else if (choice == 2) {
                System.out.print("Enter the id at which you want to update: ");
                id = input.nextInt();
                input.nextLine();

                System.out.print("Enter the name: ");
                name = input.nextLine();

                System.out.print("Enter the status: ");
                status = input.nextBoolean();

                imus.updateUser(new User(id, name, status));
            } else if (choice == 3) {
                System.out.println("Enter the ID: ");
                id = input.nextInt();

                imus.deleteUser(id);
                System.out.println("Done");
            } else if (choice == 4) {
                System.out.println("Enter ID: ");
                id = input.nextInt();

                try {
                    imus.getUser(id).toString();

                } catch (UserAccountIsBlockedException e) {
                    System.out.println(e.getMessage());
                }

            } else if (choice == 5) {
                System.out.println("Enter ID: ");
                id = input.nextInt();

                imus.blockUser(id);
                System.out.println("Done");
            } else if (choice == 6) {
                System.out.println("Enter ID: ");
                id = input.nextInt();

                imus.unblockUser(id);

                System.out.println("Done");
            } else if (choice == 7) {
                for (int i = 0; i < imus.getAllUsers().size(); i++) {
                    System.out.println(imus.getAllUsers().get(i).toString());
                }
            } else if (choice == 8) {
                System.out.println("******END******");
                break;
            }

        }

    }

}
