public class Employee{

    private int id;
	private String name;
	private Date hiringDate;
	private Department department;
	
	public Employee(Date hiringDate, Department department){
		this .hiringDate = hiringDate;
		this.department = department;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	public Department getDepartment(){
		return department;
	}
	public Date getHiringDate(){
		return hiringDate;
		
	}



}