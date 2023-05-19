package javaprogram;

public class Employee {
	String name;
	int Emp_id;
	
	Employee(String name,int Emp_id)
	{
		this.name=name;
		this.Emp_id=Emp_id;
	}
	   
	    public static void main(String[]args)
	    {
	    	Employee e1=new Employee("Deepak",10);
	    	System.out.println(e1.Emp_id);
	    	System.out.println(e1.name);

	    }
	    }