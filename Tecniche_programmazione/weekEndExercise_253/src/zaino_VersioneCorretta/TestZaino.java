package zaino_VersioneCorretta;

import java.util.Scanner;

public class TestZaino {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti oggetti può contenere lo zaino");
		int dim = sc.nextInt();
		sc.nextLine();
		System.out.println("Quanto può essere pesante lo zaino");
		int peso = sc.nextInt();
		
		Zaino z = new Zaino(dim, peso);
		
		boolean esci = false;
		
		while(!esci) {
			System.out.println("Cosa vuoi fare?\n"
					+ "e- elenca oggetti\n"
					+ "i- inserisci oggetti\n"
					+ "t- togli oggetti\n"
					+ "u- esci dal programma\n");
			
			String scelta = sc.nextLine().toLowerCase();
			
			switch(scelta) {
				case "u" ->{
					esci = true;
					sc.close();
					break;
				}
				case "e" ->{
					z.elencaOggetti();
					break;
				}
				case "i" ->{
					try {
						System.out.println("Inserisci l'oggetto e il suo peso");
						z.inserisciOgg(new Oggetto(sc.nextLine(), sc.nextInt()));
					} catch (Exception e) {
						e.getMessage();
					}finally {
						sc.nextLine();
					}
					break;
				}
				case "t" ->{
					try {
						System.out.println("Inserisci l'oggetto che vuoi togliere dallo zaino");
						z.rimuoviOgg(sc.nextLine());
					} catch (Exception e) {
						e.getMessage();
					}finally {
						sc.nextLine();
					}
					break;
				}
				default ->{System.out.println("Scelta non corretta");}
			}
		}
		
		
		
		
	}
}
