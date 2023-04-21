package provaMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class ProvaMap {
	public static void main(String[] args) {
		
		HashMap<String, String> paesi = new HashMap<>();
		
		paesi.put("Usa", "Washington D.c");
		paesi.put("Norvegia", "Oslo");
		paesi.put("Russia", "Mosca");
		paesi.put("Cina", "Pechino");

		System.out.println(paesi);
		
		//anche aggiungendo la stessa chiave la collezione non prevede duplicati, perciò non viene agg
		paesi.put("Usa", "Washington D.c");
		System.out.println(paesi);//non aggiunge la chiave
		
		//aggiungi una chiave se non esiste
		paesi.putIfAbsent("Italia", "Roma");
		System.out.println(paesi);
		
		//si può cercare per chiave
		System.out.println(paesi.get("Russia"));
		
		//si può conoscere la dimensione dell'hashSet
		System.out.println(paesi.size());
		
		//si può rimpianzare un valore associato ad una chiave
		paesi.replace("Usa", "usa capital");
		System.out.println(paesi);
		
		//si può cercare per chiavi - case sensitive
		System.out.println(paesi.containsKey("Francia"));
		
		//si può cercare per valore - case sensitive
		System.out.println(paesi.containsKey("Pechino"));
		
		//stampare solo le chiavi
		for(String chiavi:paesi.keySet()) {
			System.out.println(chiavi);
		}
		
		//stampare solo i valori
		System.out.println("Stampo solo i valori:");
		for(String valori:paesi.keySet()) {
			System.out.println(valori);
		}
		
		//tampa chiavi e valori in un unico ciclo
		for(String chiave:paesi.keySet()) {
			System.out.println("chiave: " + chiave + ", valori: " + paesi.get(chiave));
		}
		
		//eliminare un elemento utilizzando la chiave
		paesi.remove("Usa");
		System.out.println(paesi);
		
		//si tolgono tutti gli elementi dall HashMap
		paesi.clear();
		
		
		//********** HashMap con chiave e valore di diverso tipo
		
		HashMap<String, Integer> montagne = new HashMap<String, Integer>();
		montagne.put("Everest", 8848);
		montagne.put("K2", 8620);
		montagne.put("Nanga Parbat", 8176);
		
		for(String k:montagne.keySet()) {
			System.out.println("nome: " + k + " altezza: " + montagne.get(k));
		}
		
		HashMap misto = new HashMap<>();
		misto.put("nome", "mario");
		misto.put(44, "gatti in fila per 6");
		misto.put(true, 123);
		
		for(Object k:misto.keySet()) {
			System.out.println("chiave: " + k + " valore: " + misto.get(k));
		}
		
		//***********************************
		HashMap<String, String[]> biblioteca = new HashMap<>();
		
		String[] libri1 = {"a","b","c"};
		String[] libri2 = {"f","g","h"};
		String[] libri3 = {"u","v","z"};
		
		biblioteca.put("autore 1", libri1);
		biblioteca.put("autore 2", libri2);
		biblioteca.put("autore 3", libri3);
		
		for(String k:biblioteca.keySet()) {
			System.out.println("Autore: " + k + " libri: " + 
					Arrays.toString(biblioteca.get(k))); //Arrays to string per stringare l'array tirato fuori dai valori della map che sono Array
		}
		
		//************ Tree Map, collection ordinata *******************
		
		TreeMap macchine = new TreeMap<>();
		macchine.put(2, "Audi");
		macchine.put(1, "fiat");
		macchine.put(5, "Tesla");
		macchine.put(99, "Renault");
		
		System.out.println(macchine);
		
		//macchine.putAll(misto);
		
	}
}
