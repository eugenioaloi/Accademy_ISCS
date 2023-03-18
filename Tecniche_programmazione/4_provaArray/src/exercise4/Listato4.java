package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class Listato4 {
	public static void main(String[] args) {
		//chiedere all'utente 8 elementi che siano maggiori di 0
		//il numero deve rispettare la condizione
		//visualizzare l'arr inserito e quante volte l'utente ha sbagliato l'inserimento
		
		Scanner sc = new Scanner(System.in);
		
		int [] arrNum = new int [8];
		
		int i = 0;
		int countErr = 0;
		
		while(i<arrNum.length) {
			System.out.println("Inseririsci il " + (i+1) + " numero");
			int num = sc.nextInt();
			if(num>0) {
				arrNum[i] = num;
				i++;
			}else {
				System.out.println("Mi dispiace non puoi inserire un numero minore di 0 - riprova");
				countErr++;
			}
		}
		
		System.out.println(Arrays.toString(arrNum));
		System.out.println("Errori fatti: " + countErr);
			
		sc.close();
		
	}

}
