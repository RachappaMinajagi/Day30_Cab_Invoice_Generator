
/**
 * import all class Assert and Test
 */
import org.junit.Assert;
import org.junit.Test;

import cabInvoiceGenerator.CabInvoiceGenerator;

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
}
