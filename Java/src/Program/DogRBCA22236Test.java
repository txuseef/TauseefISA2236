package Program;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DogRBCA22236Test {

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
	    public void testDog() {
	        // Create two instances of the Dog class
			
DogRBCA22236 dog1 = new DogRBCA22236("Buddy", "Labrador");
			
DogRBCA22236 dog2 = new DogRBCA22236("Max", "German Shepherd");
// Modify the attributes using setter methods
	        dog1.setName("Rocky");
	        dog1.setBreed("Golden Retriever");

	        dog2.setName("Bella");
	        dog2.setBreed("Beagle");
// Test the updated values
	        assertEquals("Rocky", dog1.getName());
	        assertEquals("Golden Retriever", dog1.getBreed());

	        assertEquals("Bella", dog2.getName());
	        assertEquals("Beagle", dog2.getBreed());
}
		{

	}

}
