package exercise2;

import java.util.Scanner;

public class Listato2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Che voto hai preso?");
		int voto = sc.nextInt();
		String mess;
		boolean passato = false;
		
		//num <0 o > di 30 "numero errato"
		if(voto<0||voto>30) {
			mess="num errato";
		//num >0 o <=17 "esame non superato"
		}else if(voto<=17) {
			mess="esame non superato";
		//num >=18 o <=24 "giudizio suff"
		}else if (voto<=24 ) {
			mess = "giudizio: sufficiente";
			passato = true;
		}else {
			mess = "giudizio: buono";
			passato = true;
		}
		
		//stampa della stringa in base al voto
		System.out.println(mess);
		
		//*************PROGRAMMAZIONE A STATI************************
		if (passato) {
			System.out.println("vuoi registrare?");
			//procedura di registrazione
		}
		
		sc.close();
		
	}

}
