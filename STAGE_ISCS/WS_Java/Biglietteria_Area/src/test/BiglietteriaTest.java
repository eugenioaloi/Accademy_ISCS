package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.util.Iterator;
import java.util.Map;

import org.junit.jupiter.api.Test;

import connesione.Connesione;
import controller.GestisciBiglietti;
import controller.GestisciCliente;
import model.Biglietto;
import model.Cliente;
import model.Volo;

class BiglietteriaTest {

	@Test
	void testConnessione() {
		Connesione c = new Connesione();
		Connection conn = c.connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
					"root", "password");
		assertTrue(conn!=null);
	}
	
	@Test
	void testMappaClienti() {
		Connesione c = new Connesione();
		Connection conn = c.connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
				"root", "password");
		Map<String, Cliente> mappaClienti = c.mappaClienti();
		assertEquals(3, mappaClienti.size());//tuple tabella 3
	}
	
	@Test
	void testMappaBiglietto() {
		Connesione c = new Connesione();
		Connection conn = c.connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
				"root", "password");
		Map<String, Biglietto> mappaBiglietti = c.mappaBiglietti();
		assertEquals(5, mappaBiglietti.size());//tuple tabella 5
	}
	
	@Test
	void testMappaVolo() {
		Connesione c = new Connesione();
		Connection conn = c.connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
				"root", "password");
		Map<String, Volo> mappaVoli = c.mappaVoli();
		assertEquals(4, mappaVoli.size());//tuple tabella 4
	}
	
	@Test
	void testClienteIsPresent() {
		GestisciCliente gc = new GestisciCliente();
		Connesione c = new Connesione();
		Connection conn = c.connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
				"root", "password");
		Map<String, Cliente> mappaCliente = c.mappaClienti();
		assertTrue(gc.isPresent(mappaCliente, "CL01"));//cliente presente in anag
		assertFalse(gc.isPresent(mappaCliente, "CL11"));//cliente non presente in anag
	}
	@Test
	void testEsistePrenotazione() {
		GestisciBiglietti gb = new GestisciBiglietti();
		Connesione c = new Connesione();
		Connection conn = c.connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
				"root", "password");
		Map<String, Biglietto> mappaBiglieti = c.mappaBiglietti();
		assertTrue(gb.esistePrenotazione(mappaBiglieti, 1));//cod presente in anag
		assertFalse(gb.esistePrenotazione(mappaBiglieti, 11));//cod non presente in anag
	}
	
	
	
	

}
