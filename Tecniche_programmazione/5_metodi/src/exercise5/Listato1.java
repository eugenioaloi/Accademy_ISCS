package exercise5;

import java.util.Scanner;

public class Listato1 {
	
	static void dueNum( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il primo num");
		int a = sc.nextInt();
		System.out.println("Inserisci il secondo num");
		int b = sc.nextInt();
		if(a==b) {
			a++;
			b++;
			System.out.println("a increm: "+ a + " b increm: " + b);
		}else {
			System.out.println("ecco i due numeri " + a + ", " + b);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		//una funzione in grado di accettare 2 numeri dall'utente
		//se i numeri sono uguali li incrementa, altrimenti li stampa
		
		dueNum();
		
	}
}
