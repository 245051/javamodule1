package Paramtext;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Before;


@RunWith(Parameterized.class)
public class TestPrimenum{
	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimenNum primeNumber;//object ref
	
	@Before
	public void initialize() {
		primeNumber = new PrimenNum();
	}
	
	
	
	
	public TestPrimenum(Integer inputNumber,Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult= expectedResult;
	}
	
@Parameterized.Parameters
	public static Collection primeNumber() {
	
	return Arrays.asList(new Object[][] {
		{2,true},
		{6,false},
		{19,true},
		{22,false},
		{23,true},
		{24,false},
		{10,true}}
	);
}


		@Test
		public void testValidator() {
			//fail("Not yet implemented");
			System.out.println("parameterized number is"+inputNumber);
			assertEquals(expectedResult,primeNumber.ppno(inputNumber));
		
		
		
		}

	}



	



