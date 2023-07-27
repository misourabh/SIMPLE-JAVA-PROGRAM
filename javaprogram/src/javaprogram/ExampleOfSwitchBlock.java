package javaprogram;

import java.util.Scanner;

public class ExampleOfSwitchBlock {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("WHICH DAY YOU WANT TO FIND");
        String day = scanner.next();
        switch (day) {
		case "monday" :
		{
			System.out.println("SIR PLEASE PLAY CRICKET");
		}
			
	    break;
	    
	    case "tuesday":
	    case  "wednesday":
	    {
	    	System.out.println("SIR PLEASE PLAY TENNIS");
	    }
	    	break;
	    case "thursday":
        case	"friday":    
        {
        	System.out.println("SIR PLEASE PLAY HOLLYBALL");
        }
        case "saturday":
        {
        	System.out.println("SIR PLEASE PLAY FOOTBALL");
        }
            break;

		default:
		{
			System.out.println("TAKE REST ITS HOLIDAY SIR");
		}
		
		}
	}

}
