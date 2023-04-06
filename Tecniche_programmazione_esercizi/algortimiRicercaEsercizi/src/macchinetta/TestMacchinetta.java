package macchinetta;

import java.util.HashMap;

public class TestMacchinetta {
	public static void main(String[] args) {
		
		HashMap<String, Double> lista = new HashMap<>();
		
		lista.put("panino vegano", 5.50);
		lista.put("panino", 4.00);
		lista.put("patatine", 2.00);
		lista.put("coca", 1.50);
		lista.put("acqua", 1.00);
		lista.put("aranciata", 1.50);
		//lista.put("caramelle", 0.50);
		lista.put("cioccolata", 1.50);
		
		
		Double conto = Macchinetta.conto(lista);

		System.out.println("Il conto è: " + conto);
		
	}
}
