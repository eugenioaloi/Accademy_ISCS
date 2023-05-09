package test;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.SchedaPersona;

class SchedaPersonaTest {
	
	static SchedaPersona sp;
	/*
	 */
	@BeforeEach
	void setUpBeforeClass() throws Exception{
		try {
			sp = new SchedaPersona();
		} catch (Exception e) {
			fail("Errore inizializzazione");
		}
	}
	
	@Test
	void testEquals() {
		SchedaPersona spTest = new SchedaPersona("Mario Rossi", "via da qui", "+123");
		SchedaPersona sp1 = new SchedaPersona(" V ", "X", "+123");
		assertTrue(spTest.equals(sp1));
	}
	
	@Test
	void testContains() {
		SchedaPersona spTest = new SchedaPersona("Mario Rossi", "via da qui", "+123");
		assertTrue(spTest.contains("via da qui"));
		
		
	}
	

}
