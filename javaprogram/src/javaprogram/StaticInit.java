package javaprogram;

public class StaticInit {
   static int k=10;
   static int l;
   static {
	   System.out.println(k);
	   k=30;
	   l=50;
	}
   static int c;
   static {
	   System.out.println(l);
   }
   public static void main(String[] args) {
	System.out.println(k);
	System.out.println(l);
	System.out.println(c);
   }
   static {
	   System.out.println(l);
	   l=20;
   }
}
