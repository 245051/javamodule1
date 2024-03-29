package TestException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TellerTest {
	Teller teller = new Teller();
//	private static final Class<? extends Throwable> t = null;
//
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test(expected =InvalidTransactionAmountException.class)
	public void testValidateNegativeAmount() {
		
		teller.validateTransaction("EUR", -100);
	}
	@Test(expected = IllegalArgumentException.class)
		public void testValidateNegativeAmount2() {
			Teller.validateTransaction("Rup", 34);
			
		}
	}


