package listato4;

import java.util.Scanner;

public class Listato4 {
	public static void main(String[] args) {
		
	//Data una stringa inserita in input, dire se è palindroma oppure no.
	//Una stringa è palindroma se la sequenza di caratteri letti da sinistra adestra, oppure da destra 
	//a sinistra è la stessa.
	//OUTPUT: Stringhe palindrome -> oro,afa,radar, osso,ai lati d italia,i topi non avevano nipoti.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci una frase o una parola per scoprire se è palindroma");
		String origS = sc.nextLine();
		
		//variabile per invertire la stringa or
		String reversS = "";
		
		//eliminazione degli eventuali spazi nella stringa originale 
		String [] tempS = origS.split(" ");
		
		//creazione di una Stringa comparabile senza spazi
		String sComparable= "";
		
		for (String s:tempS) {
			sComparable += s;
		}
		
		//****** Algoritmo per invertire la Stringa ******
		
		//l'indice i deve partire dalla lunghezza della stringa-1, per non uscire dal bound
		//la condizione arriva fino al primo indice, ovvero lo zero
		//l'indice d'incremento diminuisce fino allo zero
		
		//La stringa si valorizza ogni volta con il carattere trovato all'indice diminuito fino allo zero
		for(int i=(sComparable.length()-1);i>=0;i--) {
			reversS = reversS + sComparable.charAt(i);
		}
		
		boolean flag = sComparable.toLowerCase().equals(reversS.toLowerCase());
		
		//controllo se le stringhe reverse e s sono simili
		String mess = flag? "La stringa " + origS + " è palindroma":"La stringa " + origS +" NON è palindroma"; 
		
		//stampa del risultato
		System.out.println(mess);		
		
		sc.close();
		
	}
}
