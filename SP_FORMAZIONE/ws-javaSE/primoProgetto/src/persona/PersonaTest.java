package persona;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void checkEtaMagg30() {
		Calendar cal = Calendar.getInstance();
	    cal.clear();
	    cal.set(Calendar.YEAR, 1990);
	    Date data = cal.getTime();
		Persona p = new Persona("Test", "Test", data);
		int eta = p.eta(data);
		assertTrue(eta>30);
	}
	
	@Test
	void checkUpperString() {
		Calendar cal = Calendar.getInstance();
	    cal.clear();
	    cal.set(Calendar.YEAR, 1999);
	    Date data = cal.getTime();
		Persona p = new Persona("TEST", "Test", data);
		assertTrue(p.getNome().equals(p.getNome().toUpperCase()));
	}

}
