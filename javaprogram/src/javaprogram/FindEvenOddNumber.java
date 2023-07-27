package javaprogram;

import java.util.Scanner;

public class FindEvenOddNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int number = scanner.nextInt();
        if(number%2==0) {
        	System.out.println(number+" IS EVEN NUMBER");
        }
        else {
			System.out.println(number + " IS ODD NUMBER");
		}
	}

}
