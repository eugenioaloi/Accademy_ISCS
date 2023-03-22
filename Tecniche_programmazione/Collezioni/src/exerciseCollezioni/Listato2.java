package exerciseCollezioni;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Listato2 {
	
	static void stampaMenu() {
		System.out.println("Premi 1 per inserire una persona e i relativi numeri");
		System.out.println("Premi 2 per cancellare una persona");
		System.out.println("Premi 3 per stampare una persona e i relativi numeri");
		System.out.println("Premi 4 per l'elenco di tutti i numeri presenti in rubrica");
		System.out.println("Premi 5 per uscire \n");
	}
	
	public static void main(String[] args) {
		
		//Traccia -> vedi traccia listato2
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer[]> rubrica = new HashMap<>();
		String nome = "";
		
		String selezione = "";
		boolean flag= !selezione.contentEquals("5");
		
		System.out.println("*** Benvenuto/a nella rubrica");
		stampaMenu();
		
		while (flag) {
			System.out.println("Fai una scelta \n Premi-5 per uscire dal programma");
			selezione = sc.nextLine();
			
			switch (selezione) {
				case "1" ->{//Inserisce persona e associa i numeri - OK
					
					System.out.println("Inserisci il nome della persona");
					nome =sc.nextLine();
					System.out.println("Quanti numeri di telefono vuoi associare a " + nome+ "? ");
					int limite = sc.nextInt();
					Integer [] numeri = new Integer[limite];
					
					for(int i=0;i<numeri.length;i++) {
						System.out.println("Inserisci il " +(i+1) + " di telefono");
						numeri[i] = sc.nextInt();
					}
					rubrica.put(nome, numeri);
					break;
				}
				case "2" ->{//Cancella una persona - OK
					System.out.println("Inserisci il nome della persona che vuoi eliminare");
					nome = sc.nextLine();
					
					for(String k:rubrica.keySet()) {
						if(k.contentEquals(nome.toLowerCase())) {//se esiste il nome rimuovilo
							rubrica.remove(nome);
							System.out.println("Contatto eliminato");
						}else {//se non esiste il nome stampa messaggio all'utente
							System.out.println("Nome non presente nella rubrica");
						}
					}
					break;
				}
				case "3" ->{//Ricerca una persona e stampa i numeri associati - OK
					System.out.println("Inserisci il nome della persona che vuoi visualizzare");
					nome = sc.nextLine();
					
					for(String k:rubrica.keySet()) {
						if(k.contentEquals(nome.toLowerCase())) {//se esiste il nome rimuovilo
							System.out.println(nome+" ha associato questi numeri: " + Arrays.toString(rubrica.get(nome)));
						}else {//se non esiste il nome stampa messaggio all'utente
							System.out.println("Nome non presente nella rubrica");
						}
					}
					break;
				}
				case "4" ->{//Elenco di tutti i nomi con relativi numeri associati
					//stampare rubrica
					
					for(String rub:rubrica.keySet()) {
						System.out.println("Persona: " + rub +
								", numeri associati: " + Arrays.toString(rubrica.get(rub))
								);
					}
					
					System.out.println("caso 4");
					break;
				}
				case "5" ->{//Esce dal programma
					flag = false;
					System.out.println("Programma chiuso");
				}
			}
		}

	sc.close();
		
	}//main
}//classe
