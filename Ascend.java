// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
	public static void main(String[] args) {
        //A function for receiving input"
		int num = Integer.parseInt (args[0]);
		//Generates three random numbers chosen
		int a = (int) (Math.random() * num); 
		int b = (int) (Math.random() * num); 
		int c = (int) (Math.random() * num);
        //Calculate the Min 
		int minNumber = Math.min(a, Math.min(b, c));
        //Calculate the Max
		int maxNumber = Math.max(a, Math.max(b, c));
		int middle = a + b + c - maxNumber - minNumber; 

		System.out.println(minNumber + " " + middle + " " + maxNumber);
		System.out.println(maxNumber + " " + middle + " " + minNumber); 



	}	
}
		
	