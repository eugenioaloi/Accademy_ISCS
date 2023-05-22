package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import controller.Parole;

class ParoleTest {

	@Test
	void testCountAll() {
		Parole p = new Parole("parole.txt");
		assertTrue(p.countAll()==19);
	}
	
	@Test
	void testArrayParole() {
		Parole p = new Parole("parole.txt");
		String arrParole[] = {"ciao", "mare", "simone", "computer", "stupido", "superman", "ha", "il", "mantello", "acqua",
				"bici", "da", "corsa", "sardegna", "giro", "d", "italia", "ciao","laparolapiulungaèquesta"};
		assertArrayEquals(arrParole, p.parole());
	}
	
	@Test
	void testCountParola() {
		Parole p = new Parole("parole.txt");
		assertEquals(p.count("ciao"),2);
	}
	
	@Test
	void testParolaMax() {
		Parole p = new Parole("parole.txt");
		assertEquals("laparolapiulungaèquesta",p.parolaMax());
	}
	
	@Test
	void testArraParolePiuPiccole() {
		Parole p = new Parole("parole.txt");
		
	}
	
	
	
	

}
