package frutta;

import java.util.ArrayList;

public class Cesto <T extends Frutta> {//si può estendere anche il tipo generico ad un tipo definito es Frutta
	
	private double pesoMax = 5.0;
	private double pesoAttuale = 0.0;

	 private ArrayList<T> cesto = new ArrayList<>();
	 
	 public double getPeso() {
		 return pesoAttuale;
	 }
	 
	 public void aggiungi(T frutto) throws Exception {
		 if(pesoAttuale+frutto.peso>pesoMax ) {
			 throw new Exception("Peso massimo superato");
		 }
		 cesto.add(frutto);
		 pesoAttuale+=frutto.peso;
	 }

	@Override
	public String toString() {
		return "Cestoo= " + cesto + " pesoMax= " + pesoMax + ", pesoAttuale=" + pesoAttuale;
	}
	 
}
