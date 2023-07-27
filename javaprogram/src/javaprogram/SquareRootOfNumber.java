package javaprogram;

import java.util.Scanner;

public class SquareRootOfNumber {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int number=scanner.nextInt();
		double sqrt = Math.sqrt(number);
		System.out.println(sqrt);


	}

}
