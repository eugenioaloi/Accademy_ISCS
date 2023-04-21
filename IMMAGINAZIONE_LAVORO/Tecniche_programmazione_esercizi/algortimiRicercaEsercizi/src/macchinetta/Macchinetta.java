package macchinetta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Macchinetta {

	public static double conto(HashMap<String, Double>lista) {
	
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		double tot = 0;
		
		ArrayList<String> prodotti = new ArrayList<>();
		
		while(flag) {
			System.out.println("Vuoi prendere qualcosa? -premi s per continuare -esci per uscire");
			String selezione = sc.next();
			sc.nextLine();
			if(selezione.contentEquals("esci")) {
				flag = false;
				sc.close();
				System.out.println("programma chiuso");
			}else {
				System.out.println("Scegli cosa prendere");
				String prod = sc.nextLine();
				System.out.println("prodotto scelto: " + prod);
				for(String l:lista.keySet()) {
					if(l.contentEquals(prod.toLowerCase())) {
						prodotti.add(prod);
						tot += lista.get(l);
					}
				}
			}
		}
		
		System.out.println("Prodotti scelti: " + prodotti);
		
		return tot;
	}
	
}
