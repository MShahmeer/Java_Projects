import java.util.Scanner;

public class EmployeeTest{
    
	public static void main(String [] args){
		Scanner inputInt = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("Enter Employee id:");
		int employeeId = inputInt.nextInt();
		
		System.out.print("Enter Employee Name:");
		String employeeName = inputString.nextLine();
		
		System.out.print("Enter Hiring Date:");
		int day = inputInt.nextInt();
		
		System.out.print("Enter Hiring Month:");
		int month = inputInt.nextInt();
		
		System.out.print("Enter Hiring Year:");
		int year = inputInt.nextInt();
		
		System.out.print("Enter the Department Name:");
		String name = inputString.nextLine();
		
		
		Employee employee1 = new Employee(new Date(day,month,year), new Department());
		
		employee1.setId(employeeId);
		employee1.setName(employeeName);
		employee1.getDepartment().setDepartmentName(name);
		
		System.out.println("----------------------------");
		System.out.println("Employee Information:");
		
		System.out.println("Employee Id:"+employee1.getId());
		System.out.println("Employee Name:"+employee1.getName());
		System.out.println("Employee Department:"+employee1.getDepartment().getDepartmentName());
		System.out.println("Employee Hiring Date:"+employee1.getHiringDate().getDay()+":"+employee1.getHiringDate().getMonth()+":"+employee1.getHiringDate().getYear());
		
	}
	
}