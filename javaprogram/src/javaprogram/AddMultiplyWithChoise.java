package javaprogram;

import java.awt.Choice;
import java.util.Scanner;

public class AddMultiplyWithChoise {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER 1ST NUMBER");
		int a=scanner.nextInt();
		System.out.println("ENTER 2ND NUMBER");
		int b=scanner.nextInt();
		System.out.println("PLEASE CHOICE ANY ONE NUMBER:-");
		System.out.println("1: FOR ADDITION PROCESS");
		System.out.println("2: FOR SUBTRACTION PROCESS");
		System.out.println("3:FOR DIVISION PROCESS");
		System.out.println("4:FOR MULTIPLICATION PROCESS");
		System.out.println("YOUR CHOICE IS ");

		Scanner scanner2=new Scanner(System.in);
		int choice=scanner2.nextInt();

		if (choice==1) 
		{
			System.out.println("RESULT OF ADDITION IS "+ (a+b) );
			
		}
		else if (choice==2) 
		{
			System.out.println("RESULT OF SUBTRACTION IS "+ (a-b));
			
		}
		 else if (choice==3) 
		{
			System.out.println("RESULT OF DIVISION IS "+ (a/b));
			
		}
		 else if (choice==4) 
		{
			System.out.println("RESULT OF MULTIPLICATION IS "+ (a*b));
			
		}
		
		else {
			System.out.println("PLESE ENTER CORRECT CHOICE WHICH IS IN DISPLY");
		}
		


	}

}