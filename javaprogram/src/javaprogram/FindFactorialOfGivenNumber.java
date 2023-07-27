package javaprogram;

import java.util.Scanner;

public class FindFactorialOfGivenNumber
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("WHICH NUMBER YOU WANT TO FIND");
		int no=scanner.nextInt();
		int fact=1;
        for(int i=1; i<=no; i++) 
        {
        	fact=fact*i;
        }
         System.out.println(fact);

	}

}
