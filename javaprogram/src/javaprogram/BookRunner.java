package javaprogram;

public class BookRunner
{
	public static void main(String[] args) {
		Book cleanCode = new Book(10);
		Book effectiveJava = new Book(10);
		Book artOfProgramming = new Book(30);
		cleanCode.setNoOfCopies(20);
		System.out.println(cleanCode.getNoOfCopies());//20
		
		cleanCode.increaseTheNumberOdCopies(10);//20+10=30
		System.out.println(cleanCode.getNoOfCopies());
         
		cleanCode.decreaseTheNumberOdCopies(29);
		System.out.println(cleanCode.getNoOfCopies());

		
		
	}

}
