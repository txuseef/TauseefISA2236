package Program;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciRBCA22236Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		@Test
	    public void testGenerateFibonacciSeries() {
			FibonacciRBCA22236 fibonacciSeries = new FibonacciRBCA22236();
	        
	        // Test case when n = 0
	        try {
	            fibonacciSeries.generateFibonacciSeries(0);
	        } catch (IllegalArgumentException e) {
	            assertEquals("Number of terms should be greater than zero", e.getMessage());
	        }
	        
	        // Test case when n = 1
	        assertArrayEquals(new int[]{0}, fibonacciSeries.generateFibonacciSeries(1));
	        
	        // Test case when n = 2
	        assertArrayEquals(new int[]{0, 1}, fibonacciSeries.generateFibonacciSeries(2));
	        
	        // Test case when n = 5
	        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, fibonacciSeries.generateFibonacciSeries(5));
	        
	        // Test case when n = 10
	        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, fibonacciSeries.generateFibonacciSeries(10));
}

	}

