package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import efficenza.ConfrontoStringhe;

public class ConfrontoStringheTest {
	String s1="ciaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociao";
	String s2="ciaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaociaocia123";

	@Test
	public void testConfronto1() {		
		ConfrontoStringhe confronta = new ConfrontoStringhe();		
		boolean result = confronta.confrontaStringhe(s1, s2);		
	    assertEquals(false, result);
	}
	
	@Test
	public void testConfronto2() {		
		ConfrontoStringhe confronta = new ConfrontoStringhe();			
		boolean result = confronta.confrontaStringheE(s1, s2);		
	    assertEquals(false, result);
	}
}
