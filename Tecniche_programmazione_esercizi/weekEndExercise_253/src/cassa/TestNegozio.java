package cassa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class TestNegozio {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cassa cs1 = new Cassa();
		
		Calendar oggi = Calendar.getInstance();
		
		System.out.println("Quanti prodotti vuoi scansionare?");
		int nProdScansione = sc.nextInt();
		
		ArrayList<Prodotto> spesa = new ArrayList<>();
		
		for (int i = 0; i < nProdScansione; i++) {
			System.out.println("Inserisci codice a barre, descrizione  e prezzo del prodotto che vuoi scansionare");
			sc.nextLine();
			String codBarre = sc.nextLine();//si invertono gli input se non si pulisce prima lo scanner 
			String descrizione = sc.nextLine();
			double prezzo = sc.nextDouble();
			spesa.add(new Prodotto(codBarre,descrizione,prezzo));
			//spesa.add(new Prodotto(sc.nextLine(),sc.nextLine(),sc.nextDouble()));
			
		}
		
		cs1.stampaScontrino(spesa, oggi.getTime());
		
		sc.close();
		
	}
}
