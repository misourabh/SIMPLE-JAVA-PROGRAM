package javaprogram;

import java.util.Scanner;

public class DynamicRead {

	public static void main(String[] args) {
          Scanner sourabhScanner = new Scanner(System.in);
          System.out.println("ENTER SOURABH FULL NAME");
          String s = sourabhScanner.nextLine();
          System.out.println("THE FULL NAME IS  "+ s);
          System.out.println("ENTER SOURABH FIRST WORD");
          char ch =sourabhScanner.next().charAt(0);
          System.out.println("THE FIST WORD OF SOURABH  " + ch);
          
	}

}
