// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Arrays;
import java.util.Comparator;

public class Ascend {
	public static void main(String[] args) {
		int ascendGivenNumber = Integer.parseInt (args[0]);  
		int numberTwo; 
		int numberThree;
		
		Arrays.sort(ascendGivenNumber, Comparator.reverseOrder());

		System.out.println("sorted numbers from the smaller to the higest"); 
		
	}
}
