package zaino;

import java.util.ArrayList;

public class Zaino {
	
	private final double PESO_CONSENTITO = 20.00;
	private final int OGGETTI_CONSENTITI = 5;
	private ArrayList<Oggetto> zaino;
	
	public Zaino(ArrayList<Oggetto> zaino) {
		this.zaino = zaino;
	}
	
	public void addProdotto(Oggetto o) throws Exception {
		if(zaino.size()>=OGGETTI_CONSENTITI) {
			throw new Exception("Hai superato il numero di oggetti consentiti");
		}else if(calcolaPeso()>=PESO_CONSENTITO) {
			throw new Exception("Hai superato il peso consentito");
		}else {
			zaino.add(o);
			System.out.println("aggiunto prodotto");
		}
	}
	
	public double calcolaPeso() {
		double peso=0;
		for (Oggetto z:zaino) {
			peso += z.getPeso();
		}
		return peso;
	}
	
	public void removeOgg(Oggetto o) throws Exception  {
		if(zaino.isEmpty()) {
			throw new Exception("Lo zaino è vuoto");
		}else {
			zaino.remove(o);
			System.out.println("Tolto l'oggetto: "+ o.getNome());
		}
	}
	
	public int getOGGETTI_CONSENTITI() {
		return OGGETTI_CONSENTITI;
	}
	
	public double getPESO_CONSENTITO() {
		return PESO_CONSENTITO;
	}

	@Override
	public String toString() {
		String msg ="";
		if(zaino.isEmpty()) {
			msg ="Lo zaino è vuoto";
		}else {
			for(Oggetto o:zaino) {
				msg += o.getNome() + ", ";
			}
		}
		return msg;
	}

	
}
