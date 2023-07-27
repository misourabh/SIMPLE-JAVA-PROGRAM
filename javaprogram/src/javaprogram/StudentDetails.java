package javaprogram;

public class StudentDetails{
	String name;
	int id;
	long contact;
    static String schoolName="S.V.C.S.HIGH SCHOOL SOLAPUR";
    StudentDetails(String name) 
    {
    	this.name=name;
    }
     StudentDetails(String name,int id){
    	this(name);
    	this.id=id;
    }
     StudentDetails(String name,int id,long contact){
    	 this(name, id);
    	 this.contact=contact;
    	 
     }
     public void getAttributes() {
    	 System.out.println("THE NAME IS "+ name);
    	 System.out.println("THE ID IS " + id);
    	 System.out.println("THE CONTACT IS " + contact);
    	 System.out.println("THE SCHOOL NAME IS " + schoolName);
     }
     public static void main(String[] args) {
		StudentDetails st1 = new StudentDetails("SOURABH",10,7058981413l);
		st1.getAttributes();
	}
    

}
