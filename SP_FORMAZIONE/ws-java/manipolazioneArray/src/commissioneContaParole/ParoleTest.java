package commissioneContaParole;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ParoleTest {
	
	@Test
	void addParolaTest() {
		Parole p = new Parole();
		p.addParola("mare");
		assertTrue(p.paroleArray()!=null);
	}

	@Test
	void trueExistParola() {
		Parole p = new Parole("ciao ciao cane");
		assertTrue(p.existsParola("ciao"));
	}

	@Test
	void falseExistParola() {
		Parole p = new Parole("ciao ciao cane");
		assertFalse(p.existsParola("casa"));
	}
	
	@Test
	void deleteParolaTest() {
		Parole p = new Parole("mare cane casa");
		String [] arrString = {"cane","casa"};
		p.deleteParola("mare");
		assertArrayEquals(arrString, p.paroleArray());
	}
	
	@Test
	void contaParole() {
		Parole p = new Parole("mare cane casa");
		assertEquals(3, p.contaParole());
	}
	
	@Test
	void testOccorenze() {
		Parole p = new Parole("mare mare casa");
		int num = p.occorrenzaParola("mare");
		assertEquals(2,num);
	}
	
	@Test
	void testParolaMaxOccorenze() {
		Parole p = new Parole("mare mare casa");
		assertEquals("mare",p.parolaConMaxOccorrenze());
	}
	
	@Test
	void testaMaxOccorenzeNum() {
		Parole p = new Parole("mare mare casa");
		assertEquals(2, p.maxOccorenzeNum());
	}
	
	@Test
	void paroleArrayTest() {
		Parole p = new Parole("mare mare casa");
		String [] checkArray = {"casa","mare"};
		assertArrayEquals(p.paroleArray(), checkArray);
	}
	
}
