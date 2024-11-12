// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		//what is the current value 
		int currentValue = Integer.parseInt(args[0]);
		//the interest that have in each year 
		double interest = Double.parseDouble(args[1])/100; 
		int numOfYears = Integer.parseInt(args[2]);
		// The current value mult interest exponent the number of years
		int futureValue = (int)(currentValue * Math.pow((1 + interest), numOfYears));
		//print the details of the amount after the calculation
		System.out.println("After " + numOfYears + " years, " + currentValue +
		 " saved at " +interest*100 + "% will yield $" + futureValue);

		
	}
}