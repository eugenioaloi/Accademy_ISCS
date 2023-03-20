package provaArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ProvaArraylist {
	/*
	 *.add(i, elem) aggiunge l'elem
	 *remove(i) -> rimuove l'elem all'indice specificato
	 *size() -> dimensione
	 *get(i) -> ritorna l'elemento in posizione i
	 *set(i) -> assegna l'elemento alla posizione i
	 *isEmpty() -> true/false se l'array è vuoto
	 * */
	
	public static void main(String[] args) {
		
		ArrayList miaLista= new ArrayList<>();//metodo generico, non prevede dichiarazione tipo di dato
		
		//Gli arraylist prevedono solo le classi wrapper come tipo di dato e non i tipi primitivi
		ArrayList<String> parole= new ArrayList<>();//metodo che prevede dichiarazione del tipo di dato
		
		ArrayList<Character> lettere= new ArrayList<>();//metodo che prevede dichiarazione del tipo di dato
		lettere.add('a');
		lettere.add('b');
		lettere.add(0,'c');
		
		System.out.println(lettere);
		
		//voglio conoscere l'elemento in posizione i - non posso farlo con l'indice, 
		//posso utilizzare il metodo get della collezione arrayList con un indice i
		for (int i = 0; i < lettere.size(); i++) {
			System.out.println("Elemento in posizione " + i + " = " + lettere.get(i));
		}
		
		for(char lettera:lettere) {
			System.out.print(lettera+", ");
		}
		
		System.out.println();
		
		//il metodo accetta in input una funzione. Funzioni di callback = si deve inserire come parametro un'altra funzione
		
		lettere.forEach(lettera->{System.out.println(lettera);});
		lettere.forEach(System.out::println);
		
		System.out.println(lettere.contains('a'));
		
		//************ Trasformare un Array in un ArrayList ************ 

		char[] ch = {'a','b','c'};
		
		ArrayList chars = new ArrayList(Arrays.asList(ch));
		
		for(Object c:chars) {
			System.out.println(c);
		}
		
		chars.set(0, "y");
		
		//for each sull'arrayList con una lambda exp
		chars.forEach(c->System.out.println(c));
		
		//l'arraylist è pieno o e vuoto?
		System.out.println(chars.isEmpty());
		
		//rimuovere un elemento
		chars.remove(0);
		chars.forEach(c->System.out.println(c));
		
		//si può ciclare una collezione anche con un iteratore
		Iterator iter = chars.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//******************************************
		
		ArrayList nani = new ArrayList<>();
		nani.add("pisolo");
		nani.add("eolo");
		nani.add("mamolo");
		nani.add("gongolo");
		nani.add("cucciolo");
		nani.add("dotto");
		nani.add("brontolo");
		
		nani.add(chars);
		
		stampa(nani);
		
		System.out.println("nuova riga");
		
		//eliminare alcuni elementi in un range
		nani.subList(4, 6).clear();
		stampa(nani);
		
		nani.removeAll(chars);
		
		Collections.sort(nani);
		stampa(nani);
		
		//binarySearch funziona solo se l'arraylist è ordinato - serve a cercare un elemento specifico
		System.out.println(Collections.binarySearch(nani, "eolo"));
		
		//reverse, inverte l'array
		Collections.reverse(nani);
		
		//si può passare un tipo di riferimento in un costruttore, non si possono solo schiantare i valori
		ArrayList copia = new ArrayList(nani);
		System.out.println(copia);
		
		
	}//main
	
	public static void stampa(ArrayList parole) {
		for(Object parola:parole) {
			System.out.print(parola+", ");
		}
	}
	
}//classe
