package firstTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	
	Calculator calc = new Calculator();
	@Before
	public void setUp() throws Exception{
		calc = new Calculator();
	}
	@Test
	public void testPowerZero() {
		int inputBase = 0;
		int exp =0;
		int expectedValue = 0;
		double actualValue = calc.power(inputBase, exp);
		assertEqual(expectedValue,actualValue);
		
	}
	@Test
	public void testPower() {
		//fail("Not yet implemented");
		int inputBase =2;
		int exp =3;
		double expectedValue =8;
		double actualValue = calc.power(inputBase,exp);
		//assertTrue(expectedValue == actualValue);
		assertEqual(expectedValue,actualValue);
		
	}

	private void assertEqual(double expectedValue, double actualValue) {
		// TODO Auto-generated method stub
		
	}
	
	

}
