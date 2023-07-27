package javaprogram;

import java.util.Scanner;

public class PalidromeNumber {

	public static void main(String[] args) 
	{   Scanner scanner=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	    int n=scanner.nextInt();
	    int r,s=0;
		int c=n;
		while(n>0) 
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if (c==s) 
		{
			System.out.println("NUMBER IS PALIDROME NUMBER");
			
		}
		  else {
			System.out.println("THE NUMBER IS NOT PALIDROME");
		}


	}

}
