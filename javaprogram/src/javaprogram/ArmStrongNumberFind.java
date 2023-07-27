package javaprogram;

public class ArmStrongNumberFind {

	public static void main(String[] args) 
	{
		int n=153;
		int c=n;
		int rem;
		int arm=0;
		
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if (c==arm) {
			System.out.println("IT IS ARMSTRONG NUMBER");
		}
		else {
			System.out.println("IT IS NOT  ARMSTRONG NUMBER");
		}


	}

}
