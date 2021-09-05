public class Emp extends Person { 

private float Salary ; 
public Emp(int Id_number , String name, float salary ) { 
   	     super(Id_number , name); 
  	      Salary = salary; 
  	  } 
public float getSalary(){ 
 return Salary ; 
  	  } 
  String displayInfo(){ 
   return "Employee Name :" + this.getName() +  "\n" + "Id Number: " + this.getId_number() +  "\n" + "Salary : " + this.getSalary(); 
    } 
public void setSalary (float salary){
  Salary = salary; 
  			  } 

} 