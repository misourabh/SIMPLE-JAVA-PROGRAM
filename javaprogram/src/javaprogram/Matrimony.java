package javaprogram;

import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");
        int age = scanner.nextInt();
        if(age >=18 && age<=30) {
        	System.out.println("YUPP YOUR MATCH WAS FOUND");
        }
        else if (age>=31 && age<=45) {
			System.out.println("TOO HARD BUT STILL WE ARE FINDING");
		}
        else if (age>=46 && age<=100) {
			System.out.println("BETTER LUCK NEXT LIFE MAN");
		}
        else {
			System.out.println("FIRST GROW AND THEN COME");
		}
	}

}
