package frutta;

public class TestFrutta {
	public static void main(String[] args) {
		
		try {
			Mela m = new Mela();
			Pesca p = new Pesca();
			Arancia a = new Arancia();
			
			Cesto c = new Cesto();
			c.aggiungi(m);
			c.aggiungi(p);
			c.aggiungi(a);
			
			System.out.println(c);
			
			Cesto<Mela> cm = new Cesto();
			//cm.aggiungi(p);//<-- non si può aggiungere un istanza di tipo Pesca a questo Cesto parametrizzato Mela
			cm.aggiungi(m);
			cm.aggiungi(m);
			cm.aggiungi(m);
			cm.aggiungi(m);
			
			System.out.println(cm);
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
}
