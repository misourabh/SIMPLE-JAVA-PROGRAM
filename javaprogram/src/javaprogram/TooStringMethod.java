package javaprogram;

public class TooStringMethod {
	
	
	    String name;
	    int id;

	    TooStringMethod(String sname,int sid)
	    {
	        this.name=sname;
	        this.id=sid;
	    }
	    public String toString()
	    {
	        return "Student name = "+ name +"  "+"Student ID = "+ id;
	    }
	    public static void main(String[] args)
	    {
	    	TooStringMethod s1=new TooStringMethod("SOURABH DHOTRE",2918);
	        System.out.println(s1);
	    }
	    
	}


