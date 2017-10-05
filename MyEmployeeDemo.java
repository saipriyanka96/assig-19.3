package emp;
//Package is a grouping of related types providing access protection and name

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Employee{ //created class Employee
	 String name; //created three properties 
	// String will refer set of characters
	 int salary;
	//int is datatype which consists of integer
	 String designation;
	 
	 public Employee ( String name, int salary ,String designation){ 
	//created constructor and passing three properties
		 this.name=name;
//this will refer current object 
		 this.salary=salary;
		 this.designation=designation;
		 
	 }
//Get methods provide access to the value a variable holds while 
//set methods assign values to the variables of the objects.
  public String getName(){          
	  //creating the set and get methods  
	  return name;
	  //return the value
  }
  public void setName(String name){
	  this.name= name;
	  //this refers to the current object
  }
  public int getSalary(){
	  return salary;
  }
  public void setSalary(int salary){
	  this.salary= salary;
  }
  public String getDesignation(){
	  return designation;
  }
  public void setDesignation(String designation){
	  this.designation=designation;
  }
  public String toString(){
	  //This method returns itself a string.
      return "Name: "+this.name+" Salary: "+this.salary+"DEsignation: "+this.designation;
  }
 }
//implements means you are using the elements of a Java Interface in your class. 
//Java Comparable interface is used to order the objects of user-defined class
 
      class MyEmployeeCom implements Comparator <Employee>{ 
    	  //creating an interface which implements comparator 
    	  public int compare(Employee o1, Employee o2)
    	  {
    	        int flag = o1.getSalary() - o2.getSalary();
    	        if(flag==0) flag = o1.getName().compareTo(o2.getName());
    	        return flag;
    	    }
      }
    	  
  class EmployeeComparator implements Comparator<Employee>{       
	  //here it checks the as per salary and it sorts as per salary
    	  public int compare (Employee o1,Employee o2)
    	  //compare will compare the two values
    	  {
    		  if (o1.getSalary()> o2.getSalary())
    			  return 1;
    		  else if (o1.getSalary()<o2.getSalary())
    			  return -1;
    		  else {
    		//even the names need to ne compared
    			  int nameDiff =o1.getName().compareTo(o2.getName());
    			  if (nameDiff ==0)
    		//return the designation values
     		  return o2.getDesignation().compareTo(o2.getDesignation());
    				  else 
    					  return nameDiff;
    			  
    		  }
    	  }
      }

public class MyEmployeeDemo {  //created main method
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
	public static void main(String[] args)
 //static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
	
	{     
		//created main method
		//create an object 
		TreeSet<Employee> namelist = new TreeSet <Employee>(new MyEmployeeCom()); //created in treeset object
		
		namelist.add(new Employee("meera",40000,"manager"));                  //created objects in for the employee class and initialized the values
		namelist.add(new Employee("priya",50000," Senior manager"));
		namelist.add(new Employee("gauri",25000," ass manager"));
		namelist.add(new Employee("bhavya",40000,"supervisor"));
		namelist.add(new Employee("anami",30000,"sales manager"));
		namelist.add(new Employee("ela",32000,"trainer"));
	
	for (Employee employee : namelist){      
		//iterating the tree set using for each loop
		System.out.println(employee);
	}
 }
}