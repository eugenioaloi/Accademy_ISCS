package veicolo;

public class Macchina extends Veicolo {

	int porte;

	public Macchina(String nome, int ruote, int porte) {
		super(nome, ruote);
		this.porte = porte;
	}
	
	@Override
	protected void parti() {
		System.out.println("La macchina parte");
	}
	
	@Override
	protected void ferma() {
		System.out.println("La macchina si ferma");
	}
	
	@Override
	public String toString() {
		return super.toString() + " porte: " + porte;
	}
	
}
