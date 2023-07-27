package javaprogram;

import java.util.Scanner;

public class EligibleForVotingOrNot {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");
        int age = scanner.nextInt(); 
        if(age >=18) {
        	System.out.println("WOW YOU ARE "+ age +" WELCOME TO VOTING BOOTH");
        }
        else {
			System.out.println("SORRY YOU ARE "+ age +" PLEASE GO TO HOME BETA");
		}
	}

}
