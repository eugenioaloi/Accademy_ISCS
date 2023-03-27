package zaino_VersioneCorretta;

import java.util.ArrayList;

public class Zaino {
	
	ArrayList<Oggetto> zaino = new ArrayList<>();
	
	private int capienza;
	private int pesoMax;
	
	private int numeroCose = 0;
	private int peso = 0;
	
	
	public Zaino(int capienza, int pesoMax) {
		this.capienza = capienza;
		this.pesoMax = pesoMax;
	}
	
	public void inserisciOgg(Oggetto o)  throws Exception{
		if(numeroCose>=capienza) {
			throw new Exception("Hai finito lo spazio nello zaino");
		}else if(peso>=pesoMax) {
			throw new Exception("Lo zaino è troppo pesante");
		}else {
			zaino.add(o);
			System.out.println("Inserito " + o+ "\n");
			numeroCose ++;
			peso += o.getPeso();
		}
	}
	
	public void rimuoviOgg(String nome) throws Exception{
		if(zaino.isEmpty()) {
			throw new Exception("Lo zaino è vuoto");
		}else {
			for(Oggetto o : zaino) {
				if (o.getNome().toLowerCase().contentEquals(nome.toLowerCase())) {
					zaino.remove(o);
					numeroCose--;
					peso -= o.getPeso();
					System.out.println("Rimosso: " + o +"\n");
				}
			}
		}
	}
	
	public void elencaOggetti() {
		if(zaino.isEmpty()) {
			System.out.println("Zaino vuoto");
		}else {
			for(Oggetto o:zaino) {
				System.out.println(o);
			}
		}
	}
	

}
