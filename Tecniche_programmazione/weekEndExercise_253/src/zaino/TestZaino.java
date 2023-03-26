package zaino;

import java.util.ArrayList;
import java.util.Scanner;

public class TestZaino {
	
	public static void main(String[] args) {
		
		//Se passo l'oggetto direttamente la logica funziona, con lo Scanner invece no.
		//Capire perchè
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Oggetto> sacca = new ArrayList<>();
		Zaino z1 = new Zaino(sacca);
		
		boolean flag = true;

		Oggetto o1=new Oggetto("Bottiglia", 10.0);
		
		while(flag) {
			System.out.println("Scegli 1-elenco 2-inserire 3-togliere un oggeto 4-uscire");
			int scelta = sc.nextInt();
			switch(scelta) {
				case 1 ->{
					System.out.println(z1);
					break;
				}
				case 2 ->{
					/*
					System.out.println("Quale prodotto vuoi inserire? Descrizione e peso");
					String nome = sc.nextLine().toLowerCase();
					sc.nextLine();
					double peso = sc.nextDouble();
					*/
					try {
						//z1.addProdotto(new Oggetto(nome,peso));
						z1.addProdotto(o1);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
				case 3 ->{
					/*
						System.out.println("Quale prodotto vuoi eliminare? ");
						String nome = sc.nextLine().toLowerCase();
						sc.nextLine();
					*/
					try {
						//z1.removeOgg(new Oggetto(nome));
						z1.removeOgg(o1);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
				case 4 ->{
					flag = false;
					System.out.println("Programma chiuso");
					sc.close();
				}
			}
		}
		
	}//main
}//classe
