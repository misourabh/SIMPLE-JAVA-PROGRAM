package javaprogram;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
          Scanner scanner =new Scanner(System.in);
          System.out.println("ENTER A NUMBER");
          int num = scanner.nextInt();
          int sum = 0;
          for(int i=num; i!=0; i= i/10) {
        	  int rem=i%10;
        	  sum=sum+rem;
        	  
          }
          System.out.println("SUM OF DIGITS IS "+ sum);
	}

}
