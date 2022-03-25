
/**
 * import all class Assert and Test
 */
import org.junit.Assert;
import org.junit.Test;

import cabInvoiceGenerator.CabInvoiceGenerator;

/**
 * Create class CabInvoiceGeneratorTest
 */
public class CabInvoiceGeneratorTest {

	@Test
	public void whenGivenDistanceAndTimeShouldReturnTotalFare() {
		CabInvoiceGenerator fare = new CabInvoiceGenerator();
		Assert.assertEquals(70, fare.calculateFare(5, 20), 0.000);
	}
}