package javaprogram;

public class CloneObject implements Cloneable 
{   int id;
     String name;
     
     CloneObject(int sid,String sname){
    	 this.id=sid;
    	 this.name=sname;
     }

	
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		CloneObject obj =new CloneObject(10, "SOURABH DHOTRE");
		System.out.println(obj.id);
		System.out.println(obj.name);
		
		CloneObject obj2 = (CloneObject) obj.clone();
		System.out.println(obj2.id);
		System.out.println(obj2.name);

	}

}
