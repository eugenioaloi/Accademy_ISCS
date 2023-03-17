package exerciseArr;

import java.util.Scanner;

public class Listato3 {
	public static void main(String[] args) {
		//creare un arr di 10 num da tastiera
		//dire se è maggiore la somma delle POSIZIONI pari o dispari
		//output: 3 1 7 6 3 2 2 6 5 8 - la somma dispari vale 23 ed è maggiore
		
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
		
		for(int pos=0;pos<arrNum.length;pos++) {
			if(pos%2==0) {
				sumP += arrNum[pos];
			}else {
				sumD += arrNum[pos];
			}
		}
		
		if(sumP>sumD) {
			System.out.println(sumP + " è maggiore di " + sumD);
		}else {
			System.out.println(sumD + " è maggiore di " + sumP);
		}
		
		sc.close();
		
	}

}
