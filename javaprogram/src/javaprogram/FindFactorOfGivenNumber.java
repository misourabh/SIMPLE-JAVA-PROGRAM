package javaprogram;

import java.util.Scanner;

public class FindFactorOfGivenNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("ENTER A NUMBER");
	int num=scanner.nextInt();
	for(int i=1; i<=num; i++) {
		if(num%i==0) {
			System.out.println(i);
			
		}
	}
}
}
