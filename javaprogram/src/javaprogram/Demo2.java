package javaprogram;

public class Demo2 {
        int c;
        int d=20;

        public Demo2(int e) 
        {
        	System.out.println("PROGRAMMER WRITTERN INSTRUCTION FROM DEMO2()");
		        c=e;
        }
        {
        	System.out.println("FROM MULTI LINE NON-STATIC INITIALIZER");
        }
        public static void main(String[] args) {
			System.out.println("FROM MAIN METHOD()");
			Demo2 d1=new Demo2(10);
			Demo2 d2=new Demo2(20);
			System.out.println(d1.c);
			System.out.println(d2.c);
			System.out.println(d2.d);
			
			
			
		}
        
}
