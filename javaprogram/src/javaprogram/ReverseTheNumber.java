package javaprogram;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
        int no=scanner.nextInt();
		int rem;
		int rev=0;
		while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);


	}

}
