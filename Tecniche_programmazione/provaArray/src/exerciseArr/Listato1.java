package exerciseArr;

import java.util.Scanner;

public class Listato1 {
	public static void main(String[] args) {
		
		//chidedere all'ut 10 num
		//creare un arr e calcolare somma e media degli el
		
		Scanner sc = new Scanner(System.in);
		
		int[] arrNum = new int [10];
		
		//chiedo gli elementi da inserire direttamente all'utente
		for(int i=0;i<arrNum.length;i++){
			System.out.println("inserisci il  " + (i+1) + " numero");
			arrNum[i]=sc.nextInt();
		}
		
		//creazione variabile di somma e media
		int sum=0;
		
		for (int num : arrNum) {
			sum += num; 
		}

		//creazione variabile di media
		double avg = (double)sum/arrNum.length;
		
		//stampa dei risultati
		System.out.println("somma: " +sum);
		System.out.println("media: " +avg);
		
		sc.close();
		
	}
}
