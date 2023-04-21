package azienda;

import java.util.Scanner;

public class TestAzienda {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Azienda az = new Azienda("Super Power", "srl", "BattelaPesca");
		
		System.out.println("Quanti dipendenti vuoi assumere");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Inserisci il nome del dipendente che vuoi assumere");
			String nome = sc.next();
			sc.nextLine();
			System.out.println("Inserisci il cognome del dipendente che vuoi assumere");
			String cognome = sc.next();
			sc.nextLine();
			System.out.println("Inserisci l'eta del dipendente che vuoi assumere");
			az.assumi(new Dipendente(nome, cognome,sc.nextInt()));
			System.out.println();
		}
		
		System.out.println(az);
		
		sc.close();
		
	}
	

}
