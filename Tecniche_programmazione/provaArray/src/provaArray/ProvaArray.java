package provaArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class ProvaArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		/*********** INIZIO RIGA *******************
		
		//Tutti gli el devono essere dello stesso tipo
		int [] arrInt = new int [5];//dichiarazione di un array e valorizazione della dimensione
		arrInt [0] = 1;
		arrInt [1] = 2;
		arrInt [2] = 3;
		//.........
		
		//se non specificato gli interi valgono 0
		System.out.println(arrInt[4]);
		
		// i booleani valgono false
		boolean [] arrBool = new boolean [2];
		arrBool [0] = true;
		arrBool [1] = true;
		System.out.println(arrBool[2]);
		
		// le stringhe ""
		String [] arrString = new String [2];
		arrString [0] = "ciao";
		arrString [1] = "core";
		System.out.println(arrString[2]);
		
		
		String [] colori = {"bianco","nero","blu"};
		
		System.out.println(colori[1]);
		
		int lung = colori.length;//quanti elementi è un attributo dell'array
		
		//voglio conoscere l'ultimo elemento
		System.out.println(colori[lung-1]);
		
		for(int i= 0;i<colori.length; i++) {
			System.out.println(colori[i]+ " si trova in posizione : " + i);
		}
		
		//For Each
		for(String colore:colori) {
			System.out.println(colore);
		}
		
		int [] arr = new int[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] =i;
		}
		
		for (int num:arr) {
			System.out.print(num +", ");
		}
		
		//**************************************
		String s = "ciao a tutti";
		char[] ch = s.toCharArray();//crea un arr di caratterei a partire da una stringa
		for(char c:ch) {
			System.out.println(c);
		}
		
		//**************************************
		String [] animali = {"cane","tigre","leone","elefante","orso"};
		
		//voglio sapere la stringa più lunga nell'arr animali
		String lunga = animali[0];//<- si imposta questa variabile di tipo Stringa come stato
		
		for(String s1:animali) {
			if(s1.length()>lunga.length()) {
				lunga = s1;
			}
		}
		
		System.out.println("la stringa più lunga nell'arr animali é: " + lunga);
		
		//**************************************
		
		String str = "Ciao a tutti";
		
		//con la funzione split si può togliere una stringa che equivale ad un valore specifico
		String [] arrStr = str.split(" ");
		
		for(String s:arrStr) {
			System.out.print(s);
		}
		
		String str1 = "Ciao*a*tutti";
		
		//con il carattere di escape posso bypassare il warning per il carattere speciale *
		String [] arrStr1 = str1.split("\\*");

		for(String s:arrStr1) {
			System.out.print(s);
		}
		
		String str2="parola1,parola2 parola3-parola4?";
		String [] arrStr2 = str2.split("[, -?]");//quello che voglio includere come limite lo inserisco tra le []
		
		for(String s:arrStr2) {
			System.out.print(s);
		}
		
		//**************************************
		int[] numeri = {4,2,1,3};//tipo reference
		System.out.println(numeri);//in questo modo stampa l'indirizzo di memoria dove risiede l'arr
		
		System.out.println(Arrays.toString(numeri));//in questo modo stampo direttamente senza l'utilizzo di un ciclo
		
		//**************************************
		
		//creazione di un arr con valori casuali
		int [] arrRandom = new int[6];
		
		
		for (int i=0;i<arrRandom.length;i++) {
			arrRandom [i] = r.nextInt(1,90); //1-90
		}
		
		System.out.println(Arrays.toString(arrRandom));//in questo modo stampo direttamente senza l'utilizzo di un ciclo
		
		//**************************************
		
		System.out.println("Quanti numeri vuoi inserire?");
		
		//faccio inserire all'utente la lunghezza
		int quantiNum = sc.nextInt();
		
		int [] valori = new int[quantiNum];

		//in base alla lunghezza x chiedo all'utente di inserire x valori
		for(int i = 0;i<valori.length;i++) {
			System.out.println("Inserisci il numero " + (i+1));
			valori[i]=sc.nextInt();
		}
		
		for(int valore:valori) {
			System.out.println(valore);
		}
		
		//**************************************
		//Selection sort- algoritmo che va bene  quando si hanno pochi elementi
		
		for (int i=0;i<valori.length;i++) {
			
			for(int j=0;j<valori.length;j++) {
				
				if(valori[i]<valori[j]) {
					int temp = valori[i];
					valori[i]=valori[j];
					valori[j]=temp;
				}
			}
		}
		
		System.out.println("Array ordinato:" + Arrays.toString(valori));
		//**************************************
		
		Object[] misto = new Object[4];
		
		misto[0] = true;
		misto[1] = "fragola";
		misto[2] = 123;
		misto[3] = Calendar.getInstance().getTime();
		
		System.out.println(Arrays.toString(misto));
		
		//**************************************
		
		//array multidimensionale o matrici
		
		int [][] matriceNum = {
				{1,2,3},//posizione 0 primo elemento
				{10,5,6}//posizione 0 primo elemento
		};
		
		System.out.println(matriceNum[0][1]);//2
		System.out.println(matriceNum[1][2]);//6
		
		int[][] matrice = new int [2][3];
		//riga 0
		matrice[0][0] = 1; //val colonna 0
		matrice[0][1] = 2; //val colonna 1
		matrice[0][2] = 3; //val colonna 2
		
		//riga 1
		matrice[1][0] = 4;
		matrice[1][1] = 5;
		matrice[1][2] = 6;
		
		for(int i =0;i<matrice.length;i++) {
			for(int j=0;j<matrice[i].length;j++) {
				System.out.println(matrice[i][j]);
			}
			System.out.println(" ");
		}
		
		for(int[] righe: matrice) {
			for(int colonne: righe) {
				System.out.println("colonne: " +colonne);
			}
		}
		
		 *********** FINE RIGA ********************/
		//**************************************
		
		String[] frutti = {"pesche","arance","mirtilli", "lamponi"};
		String[] verdure = {"carote","peperoni","patate"};
		
		String [][] vegetali= {frutti,verdure};
		
		for(String[] veg:vegetali) {
			for(String v:veg) {
				System.out.println(v);
			}
		}
		
		System.out.println(Arrays.toString(vegetali));//in questo modo accede solo ai reference
		System.out.println(Arrays.deepToString(vegetali));//per leggere i valori dentro la matrice
		
		
		
		
		
		
		
	}
}
