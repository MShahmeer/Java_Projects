public class Employee{
   
   private String name;
   private String gender;
   private int basicSalray;
   
   public Employee(){}
   
   public Employee(String name,String gender,int basicSalray){
	   
	   this.name = name;
	   setGender(gender);
	   this.basicSalray = basicSalray;
   }
   
   private void setGender(String gender){
	   if(gender.equalsIgnoreCase(male) || gender.equalsIgnoreCase(female)){
		   this.gender = gender;
	   }
	   else{
		   System.out.println("Please enter only male or female");
	   }
   }
   
   public void setBasicSalary(int basicSalray){
	  this.basicSalray = basicSalray;
   }
   
   public String getName(){
	   return name;
   }
   public String getGender(){
	   return gender;
   }
   public int getBasicSalaray(){
	   return basicSalray;
   }
   
}