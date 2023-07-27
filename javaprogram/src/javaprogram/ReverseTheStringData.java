package javaprogram;

import java.util.Scanner;

public class ReverseTheStringData {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER ANY STRING DATA");
		String name=scanner.nextLine();
		int length=name.length();
		String rev="";
		for(int i=length-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);


	}

}
