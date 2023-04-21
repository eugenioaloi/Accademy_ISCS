package veicolo;

public class TestVeicolo {
	public static void main(String[] args) {
		
		Macchina m = new Macchina("AUDI", 2, 4);
		
		m.parti();
		m.ferma();
		
		Veicolo[] veicoli = {m, new Bicicletta("Cervelo", 2, 2)};
		for(Veicolo v: veicoli) {
			System.out.println(v);
			v.parti();//metodi polimoformici
			v.ferma();
		}
		
	}
}
