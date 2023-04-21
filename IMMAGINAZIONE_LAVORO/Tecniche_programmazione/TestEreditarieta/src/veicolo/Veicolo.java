package veicolo;

public class Veicolo {
	
	protected String nome;//con protected accedono solo le classi che estendono Veicolo
	protected int ruote;
	
	public Veicolo(String nome, int ruote) {
		this.nome = nome;
		this.ruote = ruote;
	}
	
	protected void parti(){
		System.out.println("Il veicolo si muove");
	}
	
	protected void ferma(){
		System.out.println("Il veicolo si ferma");
	}
	
	@Override
	public String toString() {
		return nome + " ha " + ruote + " ruote";
	}
	
}
