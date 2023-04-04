package exerciseArray;

import java.util.Scanner;

public class Listato2 {
	public static void main(String[] args) {
		//creare un arr di 10 num da tastiera
		//dire se è maggiore la somma dei NUMERI pari o dei dispari
		//output: 3 1 7 6 3 2 2 6 5 8 - la somma pari vale 24 ed è maggiore di 19
		
		Scanner sc = new Scanner(System.in);
		
		int[] arrNum = new int [10];
		
		//chiedo gli elementi da inserire direttamente all'utente
		for(int i=0;i<arrNum.length;i++){
			System.out.println("inserisci il  " + (i+1) + " numero");
			arrNum[i]=sc.nextInt();
		}
		
		//creazione variabile di sommaPari e sommadispari
		int sumP=0;
		int sumD=0;
		
		for (int num : arrNum) {
			if(num%2==0) {
				sumP += num;
			} else {
				sumD += num;
			}
		}

		//check maggiore
		if(sumP>sumD) {
			System.out.println(sumP + " è maggiore di " + sumD);
		}else {
			System.out.println(sumD + " è maggiore di " + sumP);
		}
		
		sc.close();
		
		
	}
}
