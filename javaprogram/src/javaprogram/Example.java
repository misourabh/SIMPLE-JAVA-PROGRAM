package javaprogram;

public class Example {
	int a=10;
	{
		System.out.println("from MLST1");
	}

	public static void main(String[] args) {
		
		System.out.println("from Main()");
		Example ns1=new Example();
		System.out.println(ns1.a);
	}		
}		
		
		
		
		//System.out.println("From MLST2");
