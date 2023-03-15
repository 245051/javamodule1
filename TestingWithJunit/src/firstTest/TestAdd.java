package firstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAdd {
	static Calculator cal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cal = new Calculator();
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
	public void testSum() {
		//fail("Not yet implemented");
		int n = 9;
		int i = 10;
		int expectedValue =19;
		int actualValue = cal.sum(n,i);
		assertEquals(expectedValue,actualValue);
	}

}
