package code;

import java.util.ArrayDeque;

public class Code {
	public static void main(String[] args) {
		
		//Fifo - first in, first out
		
		ArrayDeque ad = new ArrayDeque<>();
		
		ad.offer("cane");//aggiunge un elemento alla fine della coda
		ad.offer("gatto");//aggiunge un elemento alla fine della coda
		ad.offer("pesce");//aggiunge un elemento alla fine della coda
		
		System.out.println(ad);//[cane, gatto, pesce]
		
		System.out.println(ad.peek());//ritorna la testa della coda - cane
		
		//non esiste un metodo get perciò si fa un metodo foreach per ciclare l'array
		for(Object coda:ad) {
			System.out.println(coda);
		}
		
		ad.poll();//toglie il primo elemento della coda
		System.out.println(ad);//[gatto, pesce]
		
		System.out.println(ad.isEmpty());//ritorna true se vuota
		
		ad.pop();//elimina l'ultimo elemento
		System.out.println(ad);//[pesce]
		
		ad.clear();//svuota la lista
		
		
		
	}

}
