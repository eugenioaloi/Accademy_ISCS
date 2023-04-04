package ifElse;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		//creazione ogg di tipo Scanner per tutto il listato
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci la tua età");
		int eta = 20;
		
		//condizioni booleane
		if (eta>18){
			System.out.println("puoi entrare");//ramo vero
		}else {
			System.out.println("mi spiace devi rimanere fuori");//ramo falso
		}
		
		//*************************************************
		//System.out.println("inserisci un numero da 1 a 10");
		int num = 4;
		
		if (num>5) {
			System.out.println("numero >5");
		}else if(num==5) {
			System.out.println("numero = 5");
		}else {
			System.out.println("miinore di 5");
		}
		
		//*************************************************
		int sensore = 40;
		
		if (sensore>30) {
			System.out.println("accendi la ventola");
		}else if(sensore<10) {
			System.out.println("accendi i riscaldamenti");
		}else {
			System.out.println("non fare niente");
		}
		
		//*************************************************
		System.out.println("Inserisci due numeri");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num2==0 || num2==0) {
			System.out.println("non puoi dividere per 0");
		}else {
			System.out.println("risultato " + (num1/num2));
		}
		
		//*************************************************
		System.out.println("inserisci un numero da 1 a 10");
		int numA = sc.nextInt();
		
		if (numA%2==0) {
			System.out.println("numero pari");
		}else {
			System.out.println("numero dispari");
		}
		
		//*************************************************
		Calendar cal = Calendar.getInstance();
		
		int orario = cal.get(Calendar.HOUR_OF_DAY);//prende l'orario grazie alla costante della classe
		
		String saluto;
		
		if (orario<12) {
			saluto = "buongiorno";
		}else if (orario<18) {
			saluto = "buon pomeriggio";
		}else if (orario<18) {
			saluto = "buonasera";
		}else {
			saluto="buonanotte";
		}
		
		System.out.println(saluto);
		
		//*************************************************
		Random r = new Random();
		int nRandom1 = r.nextInt(1,7); //gli estremi non sono compresi
		int nRandom2 = r.nextInt(1,7);
		
		int tot = nRandom1+nRandom2;
		
		System.out.println("num1: " + nRandom1 + " num2: " + nRandom2 );
		
		if(tot>7) {
			System.out.println("hai vinto");
		}else {
			System.out.println("hai perso");
		}
		
		//*************************************************
		int numb =1;
		char ch='z';
		
		if(ch>numb) {
			System.out.println("si perchè la lettera viene prima dei numeri");
		}else {
			System.out.println("no");
		}
		
		//*************************************************
		
		System.out.println("Inserisci una frase");
		String frase = sc.nextLine();
		
		if (frase.equalsIgnoreCase("ciao")) {
			System.out.println("La frase contiene la parola ciao");
		}else {
			System.out.println("La frase NON contiene la parola ciao");
		}
		
		
		//*************************************************
		boolean sun = true;
		int temp = 25;
		
		//if(sun && temp>20) {//AND-> entrambe le condizioni sono vere
		if(sun || temp>20) {//OR-> almeno una delle condizioni sono vere
			System.out.println("esco");
		}else {
			System.out.println("sto a casa");
		}
		
		//ATTENZIONE-> AND ha sempre la precenza sull'OR
		
		//*************************************************
		
		
		int voto = 8;
		
		if(voto>=6) {
			System.out.println("promosso");
		}else{
			System.out.println("bocciato");
		}
		
		//la riga sopra si può stringare in una sola riga grazie all'operatore ternario
		//op ternario -> condizione da testare?caso_true:caso_falso
		
		System.out.println(voto>6?"promosso":"bocciato");
		
		int altezza = 175;
		
		String tipo = (altezza>=170?"alto":"basso");
		
		System.out.println(tipo);
		
		int a = 10;
		int b=20;
		int c = 5;
		
		int max = a>b?a:b;
		
		System.out.println("il numero maggiore tra "+ a + " e " + b + " è: " + max);
		
		int maxOUguali = (a==b)?-1:(a>b)?a:b;
		
		System.out.println("risultato: " + maxOUguali);
		
		int maxTraTre = (a>b&&a>c)?a:(b>c)?b:c;
		System.out.println("il numero magg è:" + maxTraTre);
		
		//*************************************************
		
		int i= 3;
		
		switch(i) {
			case 0: 
				System.out.println("i uguale a 0");
				break;//attenzione a non dimenticarlo o lo switch cade in tutti i casi sottostanti
			case 1: 
				System.out.println("i uguale a 0");
				break;
			case 2: 
				System.out.println("i uguale a 0");
				break;
			default:
				System.out.println("i diverso da 0 1 2");
		}
		
		char lettera = 'g';
		String mess;
		
		
		//i case negli switch POSSONO solo verificare delle uguaglianze
		
		switch(lettera) {//la condizione per funzionare può essere solo int, string o char
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				mess = lettera +" è una vocale";
				break;
			default:
				mess = lettera +" è una consonante";
				break;
		}
		
		System.out.println(mess);
		
		
		//**** Switch sequenziali tutti su di una riga ***
		
		//da JAVA 14 in poi, si possono utilizzare le arrow function
		
		switch(lettera) {
			case 'a','e','i','o','u' -> mess = lettera +" è una vocale";
			default ->  mess = lettera +" è una consonante";
		}
		
		//**** si può anche valorizzare la Stringa mess con il risultato dello switch ***
		mess =switch(lettera) {
			case 'a','e','i','o','u' -> mess = lettera +" è una vocale";
			default ->  mess = lettera +" è una consonante";
		};
		 
		//*************************************************
		
		Calendar cal1 = Calendar.getInstance();
		
		int giorno=cal1.get(Calendar.DAY_OF_WEEK);//1 sunday
		
		switch(giorno) {
			case 1: 
				System.out.println("today is sunday");
				break;
			case 2: 
				System.out.println("today is monday");
				break;
			case 3: 
				System.out.println("today is tuesday");
				break;
			case 4: 
				System.out.println("today is wednesday");
				break;
			case 5: 
				System.out.println("today is thursday");
				break;
			case 6: 
				System.out.println("today is friday");
				break;
			default:
				System.out.println("today is saturday");
		}
		
		//switch dato un mese restituisce il numero dei giorni, mese chiesto all'utente
		System.out.println("In che mese ci troviamo?");
		String mese = sc.next();
		
		//30 a nov, apr, giu e sett
		//28 feb
		//31 tutti gli altri
		
		switch(mese) {
			case "aprile","giugno","settembre","novembre"-> System.out.println("mese da 30 gg");
			case "febbraio"-> System.out.println("mese da 28 gg");
			case "gennaio","marzo","maggio","luglio","agosto","ottobre","dicembre"-> System.out.println("mese da 31 gg");
			default-> System.out.println("mese non corretto");
		}
		
		//switch dato un mese restituisce il numero dei giorni, mese ritornato da calendar
		
		Calendar cal2 = Calendar.getInstance();
		int MonthNum = cal2.get(Calendar.MONTH+1);
		
		//30 a nov, apr, giu e sett
		//28 feb
		
		switch(MonthNum) {
			case 4,6,9,11:
				System.out.println("mese da 30 gg");
				break;
			case 2: 
				System.out.println("mese da 28 gg");
				break;
			default: System.out.println("mese da 31");
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
