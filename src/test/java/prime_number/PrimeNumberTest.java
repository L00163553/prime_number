package prime_number;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PrimeNumberTest {
	
	@Test             
	public void testPrime() {
		Application app = new Application();
		assertEquals("5 is a prime number", app.getPrime("5", null));
	}    
	
}
