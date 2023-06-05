package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Cliente;
import model.Volo;
import service.ClienteService;
import service.VoloService;

class VoloServiceTest {

	@Test
	void testGetAllVoli() {
		VoloService vs = new VoloService();
		List<Volo> voli = vs.getAllVoli();
		//System.out.println(Arrays.toString(voli.toArray(new Volo[voli.size()])));
		assertEquals(voli.size(), 4);
	}
	
	@Test
	void testExistVoloByID() {
		VoloService vs = new VoloService();
		boolean flagTrue = vs.existById("VL01");//esiste il cod VL01
		assertTrue(flagTrue);
		boolean flagFalse = vs.existById("VL11");//esiste il cod VL11
		assertFalse(flagFalse);
	}
	
	@Test
	void testGetVoloByID() {
		VoloService vs = new VoloService();
		Volo v = vs.getVoloById("VL01");
		Date d = new Date(2022, 01, 25);
		assertEquals(v.getDestinazione(), "barcellona");
		assertTrue(v.getPostiDisp()==200);
	}
	
	

}
