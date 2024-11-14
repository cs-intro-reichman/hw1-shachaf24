// Represents the hh:mm time format using an AM/PM format. 

import java.util.Scanner;

public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int subtract = 12 ; 

		if (hours > 12 ) { 

			System.out.println(hours - subtract + " PM");
        }
		else if (hours == 12 ) { 
			 System.out.println(hours + " PM");
		}	 
		else if (hours == 000) {
			 System.err.println(" 0:00" + " Am");
	 	}	 
	
		
		 
	} 
}



// int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
//		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));