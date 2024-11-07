// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// sumBill gets the sum provied as an argument  
	    double sumBill =  Double.parseDouble(args[3]);
		double sumForPerson = Math.ceil(sumBill/3);
		System.out.println("Dear " + args[0] + ", " + args[1] + ", " +
		 args[2] + ": pay " + sumForPerson + " Shekels each.");
	}
}
