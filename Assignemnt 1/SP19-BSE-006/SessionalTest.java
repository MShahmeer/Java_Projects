import java.util.*;

class SessionalTest {
	public static void main(String[] args) {
		// scanner object to get inputs
		Scanner input = new Scanner(System.in);
		
		// take number of deparment
		System.out.print("Enter number of Department: ");
		int departmentCount = input.nextInt();
		
		// declare and construct empty deparments objects arrays
		Department [] departments = new Department[departmentCount];
		
		// loop through deparments
		for (int i=0; i<departments.length; i++) {
			// take deparment id
			System.out.print("Enter Department ID: ");
			int departmentId = input.nextInt();
			
			input.nextLine(); // discard return line
			
			// take deparment name
			System.out.print("Enter Department Name: ");
			String departmentName = input.nextLine();
			
			// take number of employees
			System.out.print("Enter no of employees: ");
			int employeeCount = input.nextInt();
			
			// declare and construct employee object arrays
			Employee [] employees = new Employee[employeeCount];
			
			// loop through employees
			for (int j=0; j<employees.length; j++) {
				// take employee name
				System.out.print("Enter Employee Name: ");
				String employeeName = input.nextLine();
				
				input.nextLine(); // discard return line
				
				// take employee gender
				System.out.print("Enter Employee Gender: ");
				String employeeGender = input.nextLine();
				
				// take employee salary
				System.out.print("Enter Employee salary: ");
				int employeeBasicSalary = input.nextInt();
				
				// create object on j index of employees
				employees[j] = new Employee(employeeName, employeeGender, employeeBasicSalary);
			}
			
			// create object on i index of deparments
			departments[i] = new Department(departmentId, departmentName, employees);
			
			// output the totall bonus of deparment
			System.out.printf("Bonus amount for Employees of %s : %.2f\n\n", departments[i].getName(), departments[i].calculateBonus());
		}
	}
}