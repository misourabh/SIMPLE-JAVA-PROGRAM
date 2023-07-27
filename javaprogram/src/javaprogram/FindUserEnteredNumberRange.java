package javaprogram;

import java.util.Scanner;

public class FindUserEnteredNumberRange {

	public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("ENTER NUMBER WHERE YOU START");
           int startingNumber = scanner.nextInt();
           System.out.println("ENTER WHERE YOU END");
           int endingNumber = scanner.nextInt();
           while (startingNumber <=endingNumber) {
        	   System.out.println(startingNumber);
        	   startingNumber++;
			
		}
	}

}
