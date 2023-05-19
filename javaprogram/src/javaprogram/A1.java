package javaprogram;

public class A1 
{
	int a;
	int b;
	A1(int var1,int var2)
	{
		this.a=var1;
		this.b=var2;
	}
 }
     class B1 extends A1
     {
     
    	 int c;
    	 B1(int var1,int var2,int var3)
    	 {
    		 super(var1,var2);
    		 this.c=var3;
    	 }
     }
       

   