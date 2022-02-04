/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabAssignment;

/**
 *
 * @author shahmeer
 */
import java.util.*;

public class AssignmentTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Issuable> issue = new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for BORROWER or 2 for AUTOBIOGRAPHY or 3 for EXIT ");
            System.out.print("Please Enter: ");
            int enter = input.nextInt();

            if (enter == 1) {
                System.out.print("Enter Id: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                issue.add(new Borrower(id, name));
            } else if (enter == 2) {
                System.out.print("Enter Book Price: ");
                int price = input.nextInt();
                input.nextLine();

                System.out.print("Enter Book Name: ");
                String bookName = input.nextLine();

                System.out.print("Enter Person Name: ");
                String personName = input.nextLine();

                issue.add(new Autobiography(personName, price, new Authors[1], bookName));
            } else if (enter == 3) {
                break;
            }
        }

        if (issue.size() >= 2) {
            issue.remove(issue.size() - 2);
        }
        for (int i = 0; i < issue.size(); i++) {
            if (issue.get(i).issue()) {
                System.out.println("Issue Successful");
            }
        }
    }
}

 