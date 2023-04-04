package exercise2;

import java.util.Scanner;

public class Listato4 {
	public static void main(String[] args) {
		
		//abbiamo 50caramelle da vendera a 50cent/cad
		//i clienti possono comprare le caramelle fino ad esaurimento
		//il programma indica: 
		//-quante caramelle sono disponibili
		//-quante caramelle il cliente vuole comprare
		//-se sono richieste più caramelle rispetto a quelle disponibili, si comunica 
		//-comunicare quanto costano le caramelle
		//-comunicare quando le caramelle sono finite
		
		int scorta = 50;
		double prezzo = 0.5;
		
		double prezzoVendita; 
		
		Scanner sc = new Scanner(System.in);
		
		while(scorta>0) {
			System.out.println("caramelle disp: " + scorta);//caramelle disponibili
			
			System.out.println("Quante caramelle vuoi comprare?");
			int buy= sc.nextInt();
			
			if(buy>scorta) {
				System.out.println("Mi dispiace puoi comprare solo "+ scorta );
				continue;
			}else {
				scorta -= buy;
				prezzoVendita = buy*prezzo;
				System.out.println("Caramelle comprate: " + buy); //quante caramelle vuole il cliente
				System.out.println("le caramelle costano"+ prezzoVendita);//costo caramelle
			}
			
			if(scorta==0) {
				System.out.println("Caramelle finite");
			}
		}
		
		sc.close();
			
	}//chiusura main
}//chiusura classe
