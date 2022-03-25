/**
 * Step1:-Given Distance and time,the invoice generator should return the total fare journey
 * Cost- RS 10 Per Kilometer + 1 Rs.Per minute
 * Minimum Fare -RS.5
 */

package cabInvoiceGenerator;

/**
 * Create class CabInvoiceGenerator
 * 
 * @author Rachoti
 *
 */

public class CabInvoiceGenerator {
	/**
	 * final keyword fix the value does not change
	 */
	final int COST_PER_KM = 10; // 10 Rs
	final int COST_PER_MIN = 1;// 1 RS
	final int MIN_FARE = 5;

	public static void main(String[] args) {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

		System.out.println(cabInvoiceGenerator.calculateFare(5, 20) + " Rs");
	}

	public double calculateFare(double distance, double time) {
		/**
		 * formula for total fare Cab Invoice Generator
		 */
		double fare = COST_PER_KM * distance + COST_PER_MIN * time;
		if (fare > MIN_FARE)
			/**
			 * return total Minimum fare
			 */
			return fare;
		else
			/**
			 * return total Maximum fare
			 */
			return MIN_FARE;
	}
}
