package cicli;

import java.util.Scanner;

public class Cicli {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*********** INIZIO RIGA ******************
		
		for (int i=0;i<10;i++) {//10 numeri da 0 a 9, contatore che incrementa di 1
			System.out.println(" ciao: "+i);
		}
		
		//destrutturato
		int cont = 0;
		for(;cont<10;) {//con l'inserimento dei ;
			System.out.println(" ciao: "+cont);
			cont++;
		}
		
		for (int i=10;i>0;i--) {//numeri da 0 a 9 con contatore che scala
			System.out.println(" ciao: "+i);
		}
		
		for (int i=0;i<10;i+=2) {//numeri da 0 a 9 con contatore che incrementa di 2
			System.out.println(" ciao: "+i);
		}
		
		//stampare i caratteri della tabella ASCII, partendo dai caratteri stampabili fino a z
		for (int i=33; i<122;i++) {
			System.out.println(""+i+": " + (char)i);
		}
		
		for(int i=0,j=10; i<10;i++,j--) {
			System.out.println("i: " + i + " j: " + j);
		}
		
		String s = "ciao a tutti";//la stringa è un array di char
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		
		int num = 739162;
		String numS = Integer.toString(num);
		
		for (int i = numS.length()-1; i >= 0; i--) {
			System.out.println(numS.charAt(i));
		}
		
		String s1 = "oggi è una bella giornata";
		int contSpace = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				contSpace++;
			}
		}
		
		System.out.println("numero spazi = " + contSpace);
		
		long fact=1;
		
		for (int i = 1; i < 10; i++) {
			fact*=i;
		}
		
		System.out.println("Fattoriale di 10: " + fact);
		
		
		//******* Ciclo for annidato **********
		
		for(int i= 1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(+i*j+"\t ");
			}
			System.out.println();
		}
		
		//******* Ciclo While **********
		
		//La condizione viene controllata prima di eseguire l'istruzione
		int count=0;
		while (count<10) {
			System.out.println(count);
			count++;
		}
		
		//******* Ciclo DO-While **********
		
		//La condizione viene controllata dopo aver eseguito l'istruzione
		int count1=0;
		do {
			System.out.println(count1);
			count1++;
		}
		while(count1>10);
		
		
		int check= 0;
		int numIn = 0;
		
		do {
			System.out.println("se premi 0, puoi uscire dal ciclo");
			numIn = sc.nextInt();
			System.out.println("numero inserito: " + numIn);
			sc.nextLine();
		}while(numIn!=check);

		
		do {
			System.out.println("inserisci 0 per uscire");
		}while(sc.nextInt()>0);
		
		sc.close();
		
		//****************************************************
		
		char ch= 'a';
		
		//rappresenta la posizione nella tabella ASCII
		while(ch<='z') {
			System.out.println(ch);
			ch++;
		}
		
		//****************************************************
		
		int vowel = 0; 
		int consonant = 0;
		
		for(char lettera='a';lettera<='z';lettera++) {
			switch(lettera) {
				case 'a','e','i','o','u'->{
					System.out.println(lettera+ " is a vowel");
					vowel++;
				}
				default->{
					System.out.println(lettera+ " is a consonant");
					consonant++;
					break;
				}
			}
		}
		
		System.out.println("vowel: "+vowel + " consonant: " + consonant);
		
		
		//stampa fino a 5
		for (int i = 0; i <=10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i);
		}
		
		System.out.println("\n");
		
		//stampa tranne il 5
		for (int i = 0; i <=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i);
		}
		
		*********** FINE RIGA ******************/

		//******* Ciclo Infinito **********
		
		int val= 0;
		for(;;) {
			System.out.println(val);
			if(val==10) {
				break;
			}
			val++;//senza questa condizione si ottiene un ciclo infinito
		}
		
		
		
		
		
	}//CHISURA MAIN
}//CHIUSURA CLASSE
