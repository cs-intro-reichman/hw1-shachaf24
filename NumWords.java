// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int givenNumber = Integer.parseInt(args[0]);
		int hundreds = givenNumber/100 ;
		int tens = (givenNumber/10)%10 ;  
        int unitNotation = givenNumber%10;

        System.out.println(hundreds + " hundreds, " + tens + " tens, " +
		 "and " + unitNotation + " ones.");
	    
	}
}
