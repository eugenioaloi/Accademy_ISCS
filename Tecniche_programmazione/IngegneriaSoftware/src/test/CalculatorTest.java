package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import affidabilita.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		
	    Calculator calculator = new Calculator();
	    int result = calculator.add(2, 3);
	    assertEquals(5, result);
	}

	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
	    int result = calculator.subtract(5, 3);
	    assertEquals(2, result);
	}
	
	@Test
	public void testMulti() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 3);
		assertEquals(15, result);
	}
	
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(6, 3);
		assertEquals(2, result);
	}
	@Test
	public void testSquare() {
		Calculator calculator = new Calculator();
		double result = calculator.square(4);
		assertEquals(2, result);
	}
	
	@Test
	public void testCalculatorInstance() {
		Calculator calculator = new Calculator();
	    assertNotNull(calculator);
	}

}
