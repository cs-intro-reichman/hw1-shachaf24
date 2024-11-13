// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
	public static void main(String[] args) {

		int num = Integer.parseInt (args[0]);
		int a = (int) (Math.random() * num); 
		int b = (int) (Math.random() * num); 
		int c = (int) (Math.random() * num);

		int minNumber = Math.min(a, Math.min(a, b));

		int maxNumber = Math.max(a, Math.max(b, c));
		int middle = a + b + c - maxNumber - minNumber; 

		System.out.println(minNumber + " " + middle + " " + maxNumber);
		System.out.println(maxNumber + " " + middle + " " + minNumber); 



	}	
}
		
	