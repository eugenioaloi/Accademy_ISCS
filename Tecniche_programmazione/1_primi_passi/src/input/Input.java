package input;

import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		
		//chiedere all'utente 4 numeri e ne calcola la somma usando solo 2 var per tutto il codice
		Scanner sc = new Scanner(System.in);
		
		/*
		//metodo legale
		int a;
		int somma= 0;
		
		for(int i=1;i<=4;i++) {
			System.out.println("inserisci il " + i + " numero");
			a = sc.nextInt();
			somma +=a;
		}
		
		System.out.println("la somma dei numeri inseriti è:" + somma);
		*/
		
		//si utilzza un accomulatore
		
		int tot = 0;
		
		System.out.println("inserisci il primo numero");
		tot+=sc.nextInt();
		System.out.println("inserisci il secondo numero");
		tot+=sc.nextInt();
		System.out.println("inserisci il terzo numero");
		tot+=sc.nextInt();
		System.out.println("inserisci il quarto numero");
		tot+=sc.nextInt();
		
		System.out.println("il totale equivale a: " + tot);
		
		sc.close();
		
	}

}
