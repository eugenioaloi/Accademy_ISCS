package test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.RubricaTelefonica;
import controller.SchedaAzienda;
import model.SchedaPersona;
import service.IScheda;
import service.ISchedaPersona;

class RubricaTelefonicaTest {
	
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
		SchedaPersona spTest = new SchedaPersona("MARIO ROSSI", "via da qui", "+123");
		SchedaPersona sp1 = new SchedaPersona("mario Rossi", "X", "456");
		assertTrue(spTest.equals(sp1));
	}
	
	@Test
	void testContains() {
		SchedaPersona spTest = new SchedaPersona("Mario Rossi", "via da qui", "+123");
		assertTrue(spTest.contains("via da qui"));
	}
	
	@Test
	void testInsert() {
		RubricaTelefonica rubricaPC = new RubricaTelefonica(3);
		IScheda sp1 = new SchedaAzienda("mario rossi","via da qui","123");
		IScheda sp2 = new SchedaAzienda("paolo verdi","piazza le mani","456");
		IScheda sp3 = new SchedaAzienda("x","y","789");
		
		try {
			rubricaPC.insert(sp1);
			rubricaPC.insert(sp2);
			rubricaPC.insert(sp3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		IScheda arr[] = {sp1,sp2,sp3};
		assertArrayEquals(arr, rubricaPC.getSchede());
	}
	
	@Test
	void testDelete() {
		RubricaTelefonica rubricaPC = new RubricaTelefonica(3);
		IScheda sp1 = new SchedaAzienda("mario rossi","via da qui","123");
		IScheda sp2 = new SchedaAzienda("paolo verdi","piazza le mani","456");
		
		try {
			rubricaPC.insert(sp1);
			rubricaPC.insert(sp2);
			rubricaPC.delete(sp2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		IScheda arr[] = {sp1,null,null};
		assertArrayEquals(arr, rubricaPC.getSchede());
	}
	
	@Test
	void testArraySearch() {
		RubricaTelefonica rubricaPC = new RubricaTelefonica(3);
		IScheda sp1 = new SchedaAzienda("mario rossi","via da qui","+123");
		
		try {
			rubricaPC.insert(sp1);
			rubricaPC.insert(new SchedaAzienda("paolo verdi","piazza le mani","+456"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		IScheda[] arr = {sp1};
		assertArrayEquals(arr, rubricaPC.search("MARIO"));
	}
	

}
