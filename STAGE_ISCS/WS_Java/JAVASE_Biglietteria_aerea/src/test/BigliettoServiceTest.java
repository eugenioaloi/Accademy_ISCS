package test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.Biglietto;
import service.BigliettoService;

class BigliettoServiceTest {

	@Test
	void testGetAllBiglietti() {
		BigliettoService qb = new BigliettoService();
		List<Biglietto> biglietti = qb.getAllBiglietti();
		/*
		for(Biglietto b:biglietti) {
			System.out.println(b);
		}
		*/
		assertEquals(biglietti.size(), 6);
	}
	
	@Test
	void testGetAllBigliettiyID() {
		BigliettoService qb = new BigliettoService();
		List<Biglietto> biglietti = qb.getAllBigliettiByCliente("CL03");
		/*
		for(Biglietto b:biglietti) {
			System.out.println(b);
		}
		*/
		assertEquals(biglietti.size(), 1);
	}
	
	@Test
	void testExistBigliettoByID() {
		BigliettoService qb = new BigliettoService();
		boolean flagTrue = qb.existById(4);//esiste il cod 4
		assertTrue(flagTrue);
		boolean flagFalse = qb.existById(100);//non esiste il cod 100
		assertFalse(flagFalse);
	}
	
	@Test
	void testGetBigliettoByID() {
		BigliettoService bs = new BigliettoService();
		Biglietto b = bs.getBigliettoById(1);
		Biglietto blTest = new Biglietto(1, "CL01", "carta di credito", 10, "VL01");
		assertEquals(b.getTipoPagamento(), blTest.getTipoPagamento());
		assertEquals(b.getQtBiglietti(), blTest.getQtBiglietti());
	}
	
	@Test
	void testAddBiglietto() {
		BigliettoService bs = new BigliettoService();
		boolean add = bs.addBiglietto("test", "test pagamento", 25, "VL02");
		assertTrue(add);
	}
	
	@Test
	void testUpdateBiglietto() {
		BigliettoService bs = new BigliettoService();
		boolean update = bs.updateBiglietto("test", "test pagamento", 25, "VL02",5);
		assertTrue(update);
	}
	
	@Test
	void testgetQtBigliettiComprati() {
		//TO DO IMPLEMENT
	}
	
	

}
