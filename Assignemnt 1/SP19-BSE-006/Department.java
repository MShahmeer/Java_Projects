public class Department {
	private int id;
	private String name;
	private Employee [] employee;
	
	public Department(int id, String name, Employee [] employee) {
		this.id = id;
		this.name = name;
		this.employee = employee;
		
		//this.employee = new Employee[employee.length];
		//for (int i=0; i<employee.length; i++) {
			//this.employee[i] = employee[i];
		//}
	}
	
	public float calculateBonus() {
		float bonus = 0.0f;
		for (int i=0; i<this.employee.length; i++) {
			if (this.employee[i].getGender().equals("Female")) {
				bonus += this.employee[i].getBasicSalary() * 0.12f;
			} else if (this.employee[i].getGender().equals("Male")) {
				bonus += this.employee[i].getBasicSalary() * 0.10f;
			}
		}
		return bonus;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Employee [] getEmployee() {
		return this.employee;
	}
}