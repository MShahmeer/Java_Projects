import java.util.Scanner;
public class SessionalTest{

   public static void main(String [] args){
	   Scanner input = new Scanner(System.in);
	   
	   Department[] department;
	   
	   System.out.println("Enter the Number of Departments:");
	   int depart = input.nextInt();
	   
	   department = new Department(depart);
	   
	   System.out.println();
	   for int (i= 0; i<department.length; i++){
		   System.out.println("Enter the department id:");
	       int id = input.nextInt();
	   
	       System.out.println("Enter the name of department:");
	       int depName = input.nextLine();
	   
	       System.out.println("Enter the number of employees:");
	       int empNum = input.nextInt();
		   
		   for(int j =0;j<empNum; j++){
		   System.out.println("Enter the name of employee");
	       String empName = input.nextLine();
	   
	       System.out.println("Enter the Gender of Employee:");
	       String empGender = input.nextLine();
	   
		   System.out.println("Enter the Salary of employee:");
	       int salaray = input.nextInt();
	   
	   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }

}