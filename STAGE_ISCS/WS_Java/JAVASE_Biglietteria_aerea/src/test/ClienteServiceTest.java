package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.Cliente;
import service.ClienteService;

class ClienteServiceTest {

	@Test
	void testGetAllBiglietti() {
		ClienteService cs = new ClienteService();
		List<Cliente> clienti = cs.getAllClienti();
		assertEquals(clienti.size(), 3);
	}
	
	@Test
	void testExistBigliettoByID() {
		ClienteService cs = new ClienteService();
		boolean flagTrue = cs.existById("CL01");//esiste il cod CL01
		assertTrue(flagTrue);
		boolean flagFalse = cs.existById("CL11");//esiste il cod CL11
		assertFalse(flagFalse);
	}
	
	@Test
	void testGetBigliettoByID() {
		ClienteService cs = new ClienteService();
		Cliente c = cs.getClienteById("CL01");
		Cliente clTest = new Cliente("CL01", "Pippo","Franco");
		assertEquals(c.getCodCliente(), clTest.getCodCliente());
		assertEquals(c.getNome(), clTest.getNome());
	}
	
	

}
