package javaprogram;

public class Book {
	
	 private int noOfCopies;
	 
	 Book(int noOfCopies){
		 this.noOfCopies=noOfCopies;
	 }

	  public int getNoOfCopies() {
		return noOfCopies;
	}

	 public void setNoOfCopies(int noOfCopies) {
		 if(noOfCopies>0) {
		   this.noOfCopies = noOfCopies;
		 }
	}
	  public void increaseTheNumberOdCopies(int howmuch) {
		setNoOfCopies(this.noOfCopies + howmuch);
	}
	
	  public void decreaseTheNumberOdCopies(int howmuch) {
	           setNoOfCopies(this.noOfCopies - howmuch);
	}
	

}
