package javaprogram;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("ENTER A NUMBER");
         int num = scanner.nextInt();
         int count = 0;
         for(int i=num; i!=0; i=i/10) {
        	 count++;
         }
         System.out.println("THE DIGIT ARE " + count);
	}

}
