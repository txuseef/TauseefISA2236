package Program;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonRBCA22236Test {

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
	    public void testPerson() {
	        // Create two instances of the Person class
		PersonRBCA22236 person1 = new PersonRBCA22236 ("John", 30);
		PersonRBCA22236  person2 = new PersonRBCA22236 ("Alice", 25);

	        // Test the attributes of the first person
	        assertEquals("John", person1.getName());
	        assertEquals(30, person1.getAge());

	        // Test the attributes of the second person
	        assertEquals("Alice", person2.getName());
	        assertEquals(25, person2.getAge());
}
		{

	}

}
