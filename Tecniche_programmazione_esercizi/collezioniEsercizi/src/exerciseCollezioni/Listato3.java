package exerciseCollezioni;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Listato3 {
	public static void main(String[] args) {
		//creare il sistema informativo della gestione fila alle poste
		
		//le persone toccano lo schermo e generano il loro posto in coda
		//l'impiegato delle poste schiaccia un bottone per incrementare il prox da servire
		
		//creare 2 metodi: prenota e servi. Fino a che ci sono persone in coda, visualizzare la coda dei numeri e il numero da servire
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;//la posta è aperta al pubblico
		
		ArrayDeque<Integer> codaPublico = new ArrayDeque<>();
		
		while(flag) {
			System.out.println("Premi -P per prenotare un numero -Q per chiudere lo sportello -S per servire una persona");
			String prenota = sc.nextLine();
			if(prenota.toLowerCase().contentEquals("p")) {//prenotazione di un nuovo numero
				codaPublico.offer(prenota());
				System.out.println("Prenotato il numero: " + codaPublico);
			}else if (prenota.toLowerCase().contentEquals("s")) {//si serve il primo entrato in ordine di fila
				servi(codaPublico);
			}else if (prenota.toLowerCase().contentEquals("q")) {//chiusura sportello
				flag = false;
				System.out.println("Non è più possibile prenotare numeri. Sportello chiuso");
			}else {
				System.out.println("Mi dispiace hai digitato una selezione errata");
			}
		}
		
		sc.close();
		
	}//main
	
	static int numeroFila=0;//numero della fila
	
	//prenota -> genera il numero da servire come progressivo
	static int prenota() {
		numeroFila++;
		return numeroFila;
	}
	
	//servi -> serve la persona e il numero viene eliminato dalla coda per servire il prossimo se presente
	static void servi(ArrayDeque<Integer> codaPublico) { 
		if(!codaPublico.isEmpty()) {
			System.out.println("Viene servito il numero: "+ codaPublico.peek());
			codaPublico.poll();
		}else {
			System.out.println("Non ci sono più persone in coda");
		}
	}
	
}
