package javaprogram;


abstract class Phone 
{
  abstract public void  camera();
  abstract public void  browser();
  abstract public void  mp3();
}
  abstract  class Samsung extends Phone
  {
	  public void browser()
	  {
		  System.out.println("SAMSUNG WORKS ON 2G BROWSER");
	  }
	    public void mp3()
	    {
	    	System.out.println("SAMSUNG WORKS ON MP3");
	    }
 }
     class Galaxy extends Samsung
     {
   	 public void camera()
   	 {
   		 System.out.println("GALAXY WORKs ON 108MP CAMERA");
   	 }
   	   public void browser()
   	   {
   		   System.out.println("GALAXY WORKS ON 5G BRO");
   	   }
   	    public void mp3()
   	    {
   	    	System.out.println("GALAXY SUPPORTS MP3 AS WELL AS MP4");
   	    }
     }
           
     
     
     
     
     
     
     

