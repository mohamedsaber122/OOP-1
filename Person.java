public class Person { 
private int Id_number; 
private String Name ; 
public Person (int Id_number , String name  ){ 
        this.Id_number = Id_number; 
        Name = name ; 
} 

public int getId_number(){ 
  return Id_number; 
} 
public String getName(){ 
  return Name; 
} 
public void setId_number(int Id_number){ 
  this.Id_number = Id_number; 
} 
public void setName(String name ) { 
  Name = name ; 
} 
} 