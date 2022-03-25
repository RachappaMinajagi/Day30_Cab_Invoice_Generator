
/**
 * import all class Assert and Test
 */
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import cabInvoiceGenerator.CabInvoiceGenerator;
import cabInvoiceGenerator.InvoiceSummary;

public class CabInvoiceGeneratorTest {

	@Test
	public void whenGivenDistanceAndTimeShouldReturnTotalFare() {
		CabInvoiceGenerator fare = new CabInvoiceGenerator();
		Assert.assertEquals(70, fare.calculateFare(5, 20), 0.000);
	}

	@Test
	public void givenMultipleRides_ShouldReturnTotalOfTotalFare() {
		Ride[] rides = { new Ride((int) 2.0, 5), new Ride((int) 5.0, 10), new Ride((int) 0.1, 1), new Ride(20, 60) };
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		double totalFare = (Double) ((Object) invoiceService);
		Assert.assertEquals(260, totalFare, 0);
	}

	@Test
	public void givenDistanceAndTimeWhenAddedShouldReturnInvoiceSummary() {
		Ride[] rides = { new Ride(2, 5), new Ride(3, 5), new Ride(1, 1) };
		CabInvoiceGenerator fare = null;
		InvoiceSummary invoiceSummary = fare.invoiceSummaryCalculation((Rule[]) rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3, 71);
		Assert.assertEquals(expectedInvoiceSummary, invoiceSummary);
	}
	@Test
    public void givenUserIdDistanceAndTimeShouldReturnInvoiceOfUser() {
        Rule[] rides = {
                (Rule) new Ride(2, 5),
                (Rule) new Ride(3, 5),
                new Ride(1, 1)
        };
        CabInvoiceGenerator fare;
		InvoiceSummary invoiceSummary = fare.listOfRidesOfUniqueUserId(rides,"1");
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 36);
        Assert.assertEquals(expectedInvoiceSummary, invoiceSummary);
    }
}
