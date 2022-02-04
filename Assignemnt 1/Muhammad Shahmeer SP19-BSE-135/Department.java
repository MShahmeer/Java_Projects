public class Department{

   private String name;
   private int id;
   private  Employee [] employee;
   
   public Department(String name, int id, Employee [] employee){
	   this.name = name;
	   this.id = id;
	   this.employee = employee;
   }
   
   public int calculateBonusAmount(Employee employee){
	   for(int i=0; i<employee.length; i++){
		   if(employee[i].equalsIgnoreCase(male)){
			   empolyee[i].getBasicSalray() =employee[i].getBasicSalary() + (employee[i].getBasicSalary() *(10/100)); 
			   employee[i].setBasicSaray() = empolyee[i].getBasicSalray();
		   }
		   else if (employee[i].equalsIgnoreCase(female)){
			   empolyee[i].getBasicSalray() =employee[i].getBasicSalary() + (employee[i].getBasicSalary() *(12/100));
			   employee[i].setBasicSaray() = empolyee[i].getBasicSalray();
		   }   
	   }
   }

}