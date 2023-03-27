package garage;

import java.util.ArrayList;

public class Garage {
	
	private String nome;
	private ArrayList<Macchina> macchine = new ArrayList<>();
	
	public Garage(String nome) {
		this.nome = nome;
	}
	
	/*
	 * metodo che parcheggia un veicolo
	 * @param veicolo la macchina che devo parcheggiare
	 * */
	public void parcheggia(Macchina m) {
		macchine.add(m);
	}
	
	/*
	 * metodo che parcheggia una lista di veicoli
	 * @param veicoli Arrayslist di oggetti di tipo Macchina
	 * */
	public void parcheggiaTutti(ArrayList<Macchina> veicoli) {
		for (int i = 0; i < veicoli.size(); i++) {
			macchine.add(veicoli.get(i));
		}
		//macchine.addAll(veicoli);//in grado di ricevere in input direttamente una collection
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Garage [nome=" + nome + ", macchine=" + macchine + "]";
	}
	
	
	
	
}
