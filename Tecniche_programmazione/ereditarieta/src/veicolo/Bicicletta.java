package veicolo;

public class Bicicletta extends Veicolo {
	
	int pedali;

	public Bicicletta(String nome, int ruote, int pedali) {
		super(nome, ruote);
		this.pedali = pedali;
	}
	
	@Override
	protected void parti() {
		System.out.println("La bici parte");
	}
	
	@Override
	protected void ferma() {
		System.out.println("La bici si ferma");
	}
	
	@Override
	public String toString() {
		return super.toString() + " pedali: " + pedali;
	}
	
	
	

}
