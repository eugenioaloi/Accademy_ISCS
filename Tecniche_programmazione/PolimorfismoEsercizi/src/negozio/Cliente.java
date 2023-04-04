package negozio;

import persona.Persona;

public class Cliente extends Persona{
	
	static int numTessera=0;
	private int tesseraCliente=0;
	
	public Cliente(String nome, int eta) {
		super(nome,eta); 
		numTessera++;
		tesseraCliente = numTessera;
	}
	
	public int getTesseraCliente() {
		return tesseraCliente;
	}

	@Override
	public String toString() {
		return super.toString() + " n tessera: " + numTessera;
	}

}
