package javaprogram;

import java.util.Scanner;

public class LeapOrNotFindOut {

	public static void main(String[] args) 
	{ 
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE YEAR");
		int year=scanner.nextInt();
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("YEAR IS LAEP YEAR");
		}
		else {
			System.out.println("YEAR IS NOT LEAP YEAR");
		}


	}

}
