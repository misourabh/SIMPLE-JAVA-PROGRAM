package javaprogram;

public class NonStatic {

	public static void main(String[] args) {
		NonStatic ns=new NonStatic();
		ns.test();
		}
	      public void test() {
	    	  System.out.println("From NonStatic method of test()");
	      }

}
