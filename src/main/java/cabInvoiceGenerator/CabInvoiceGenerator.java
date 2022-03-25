/**
 * Step1:-Given Distance and time,the invoice generator should return the total fare journey
 * Cost- RS 10 Per Kilometer + 1 Rs.Per minute
 * Minimum Fare -RS.5
 * 
 *Step2:-The invoice generate should now take multiple rides,and calculate aggregate total for all.
 *Step3:-The invoice generate should now Return the following as apart of invoice
 *-Total Number of Rides
 *-Total Fare
 *-Average Fare Per Ride
 *Step4:- Given User id,invoice service get the list of rides from the ride Repository,and returns the Invoice
 */

package cabInvoiceGenerator;

import org.junit.Rule;

public class CabInvoiceGenerator {
	/**
	 * final keyword fix the value does not change
	 */
	final int COST_PER_KM = 10;
	final int COST_PER_MIN = 1;
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
			return fare;
		else
			return MIN_FARE;
	}

	public double calculateFareForMultipleRides(Rule[] ridesArray) {
		double totalFare = 1;
		for (Rule ride : ridesArray) {
			totalFare += calculateFare(Rule.DEFAULT_ORDER, Rule.DEFAULT_ORDER);
		}
		/**
		 * return total Minimum fare
		 */
		return totalFare;
	}

	/**
	 * Create a method invoiceSummaryCalculation
	 * 
	 * @param ridesArray
	 * @return
	 */

	public InvoiceSummary invoiceSummaryCalculation(Rule[] ridesArray) {
		double totalFare = 1;
		for (Rule ride : ridesArray) {
			totalFare += this.calculateFare(Rule.DEFAULT_ORDER, Rule.DEFAULT_ORDER);
		}
		return new InvoiceSummary(ridesArray.length, totalFare);
	}

	public InvoiceSummary listOfRidesOfUniqueUserId11(Rule[] ridesArray, String userID) {
		double totalFare = 0;
		int userRideCount = 0;
		for (Rule ride : ridesArray) {
//			if (((Object) ride).getUserID().equals(userID)) {
//				totalFare += this.calculateFare(Rule.DEFAULT_ORDER, Rule.DEFAULT_ORDER);
//				userRideCount++;
//			}
//		}
		return new InvoiceSummary(userRideCount, totalFare);
	}
		return null;

	
	}
}
