package javaprogram;

public class NonStaticc {
	int k;
	{
		k=10;
	}
	int j = 25;
	{
		System.out.println(k);
		System.out.println(j);
	}
	public static void main(String[] args) {
		System.out.println("FROM MAIN ()");
		NonStaticc nonStaticc=new NonStaticc();
		System.out.println(nonStaticc.k);
		System.out.println(nonStaticc.j);
		NonStaticc nonStaticc2=new NonStaticc();
		System.out.println(nonStaticc2.k);
		System.out.println(nonStaticc2.j);
	}
	{
		k=5;
		j=7;
		
	}

}
