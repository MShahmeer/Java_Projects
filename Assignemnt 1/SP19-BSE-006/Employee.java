public class Employee {
	private String name;
	private String gender; // Male or Female
	private int basicSalary;
	
	// constructor without argunments
	public Employee() {
		
	}
	
	// fully parametize constructor
	public Employee(String name, String gender, int basicSalary) {
		this.name = name;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}	
		
	public int getBasicSalary() {
		return this.basicSalary;
	}
}