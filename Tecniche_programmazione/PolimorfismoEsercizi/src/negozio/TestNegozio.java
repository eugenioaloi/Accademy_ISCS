package negozio;

import java.util.ArrayList;
import java.util.Calendar;

public class TestNegozio {
	public static void main(String[] args) {
		
		Cliente c = new Cliente("Mario", 65);
		
		ArrayList<Prodotto> prodotti = new ArrayList<>();
		
		//prodotti non alimentari
		prodotti.add(new ProdNonAlimentari("Vetro", 104, "Specchio", 10, c));
		prodotti.add(new ProdNonAlimentari("Carta", 456, "Libro", 10, c));
		
		//prodotti alimentari
		Calendar dLatte = Calendar.getInstance();
		dLatte.set(2023, 2, 30);
		prodotti.add(new ProdAlimentari(567, "latte", 10, c, dLatte));

		Calendar dCarne = Calendar.getInstance();
		dLatte.set(2023, 2, 30);
		prodotti.add(new ProdAlimentari(789, "Carne", 10, c, dCarne));
		
		System.out.println(c);//to string del cliente
		
		/*
		for(Prodotto prod:prodotti) {
			prod.applicaSconto();//polimorfismo
			System.out.println("Prodotti: " + prod);
		}
		 * */
		
		prodotti.forEach(prod ->{
			prod.applicaSconto();
			System.out.println("Prodotti: " + prod);
		});
		
		
	}
}
