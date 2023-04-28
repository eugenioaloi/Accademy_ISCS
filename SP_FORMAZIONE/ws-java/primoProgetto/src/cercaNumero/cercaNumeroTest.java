package cercaNumero;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class cercaNumeroTest {

	@Test
	void test() {
		int [] numeri = {1, 2, 3, 4, 5, 7, 8, 9};
		int num = 5;
		 
		assertTrue(cercaNumero.ricercaBinaria(numeri, num));
		
	}
}
