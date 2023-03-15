package TestException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExceptionTestDemo {

	private static final Class<? extends Throwable> NumberFormatException = null;
	int a;
	int b;
	int c;
	
	
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp(){
		a=10;
		b=0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=ArithmeticException.class)
	public void test() {
		//fail("Not yet implemented");
		c = a/b;
		System.out.println("result="+c);
	}

}
