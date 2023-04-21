package metodi;

import java.util.Arrays;
import java.util.Scanner;

public class Metodi {
	
	static void stampa() {
		System.out.println("ciao");
	}
	
	static void stampaParametri(String val1,String val2) {
		System.out.println("Ciao " + val1 + " " + val2);
	}
	
	static String stampaParametriOut(String val1,String val2) {
		String scritta = "Ciao " + val1 + " " + val2;
		return scritta;
	}
	
	static void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci la base");
		int base = sc.nextInt();
		System.out.println("Inserisci l'altezza");
		int altezza = sc.nextInt();
		
		if(base<0||altezza<0) {
			System.out.println("Valori inseriti non conformi");
		}
		int area = base*altezza;
		
		System.out.println("L'area del rettangolo equivale: "+ area);
		
		sc.close();
	}
	
				   //a,b sono parametri formali
	
	static boolean isDiv(int a, int b) {
		boolean divZero = a%b ==0?true:false;
		return divZero; 
	}
	
	static void leggiArray (String [] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	static String [] creaArr(String s1,String s2,String s3) {
		String [] arr = {s1,s2,s3};
		return arr;
	}
	
	static int sum(int a,int b) {//nome+parametri = firma del metodo
		return a+b;
	}
	
	//Overlad del metodo sum -> stesso nome ma diversi parametri (firma diversa)
	static int sum(int a,int b, int c) {
		System.out.println("Overload 1");
		return a+b+c;
	}
	
	static double sum(double a,double b) {
		System.out.println("Overload 2");
		System.out.println("Overload 2");
		return a+b;
	}
	
	static int sum(String x, String y) {
		System.out.println("Overload 3");
		int val1 = Integer.parseInt(x);
		int val2 = Integer.parseInt(y);
		return val1+val2;
	}
	
	static String sum(String a, String b, String c ) {
		System.out.println("Overload 4");
		return a+b+c;
	}
	
	//******** VAR ARGS ********
	static int varSum(int ...x) {
		int tot = 0;
		System.out.println("Hai passato questi numeri");
		for(int i:x) {
			System.out.println(i);
			tot+=i;
		}
		return tot;
	}
	
	//****** variabili statiche ******
	static int x=0;//le variabili statiche mantengo il val ad ogni chiamata
	static void varX() {
		System.out.println(x);
		x++;
	}
	
	static String s = "abc";
	static void stampaAst() {
		System.out.println(s);
		s+='*';
	}
	
	//******* metodi ricorsivi *******
	static void always() { 	//il metodo si richiama all'infinito
		always();
	}
	
	//si prevedono delle condizioni di uscita in caso di metodi ricorsivi
	
	//funzioni ricorsive:
	//1) un  qualcosa da ritornare (da mettere nel return)
	//2) una condizione di uscita  
	
	static void notAlways(int many) {
		if (many > 0) {
			System.out.println(many);
			many--;
			notAlways(many);
		}
		
	}
	
	static long fatt(long x) {
		if(x==0) { //case 0
			return 1;
		}else {
			return x*fatt(x-1);
		}
	}
	
	//congettura di Collaz 
	// il risultato degli ultimi 3 numeri per qualsiasi numero passato sarà sempre 421
	//se pari a/2
	//se dispari 3*a+1
	//a=1 caso di base
	
	static int congetturaCollaz(int a) {
		System.out.print(a+" - ");
		if(a==1) {//caso base, ritorna -1 per uscire dal metodo
			return -1;
		}
		if(a%2==0) {
			return congetturaCollaz(a/2);
		}else {
			return congetturaCollaz(3*a+1);
		}
	}
	
	
	
	//************* MAIN METHOD *************
	public static void main(String[] args) {
		
		/**** INIZIO RIGA
		
		stampa();//può esere chiamato N volte

		stampaParametri("Mario", "Rossi");
		
		area();
		
		String nomeCognome = stampaParametriOut("Mario", "Rossi");
		System.out.println(nomeCognome);
					//2,3 sono parametri attuali
		int res = sum(2, 3);
		System.out.println(res);
		
		boolean div = isDiv(10, 3);
		System.out.println("is div:" + div);
		
		String [] arr = {"qui","quo","qua"};
		leggiArray(arr);
		
		String [] elementi = creaArr("pippo","pluto" , "paperino");
		leggiArray(elementi);//metodo custom per leggere gli array
		
		int x = sum(1,2,3);
		int y =sum("9", "2");
		String concat = sum("ciao", " a ", "tutti");
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(concat);
		
		//******************
		
		int ris = varSum(1,2,3,4,5);
		System.out.println(ris);
		
		varX();//0 - la variabile x del metodo varX si ricorda il valore ad ogni chiamata
		varX();//1
		varX();//2
		
		stampaAst();//abc
		stampaAst();//abc*
		stampaAst();//abc**

		notAlways(3);
		
		long fatt = fatt(10);
		System.out.println(fatt);
		 **** FINE RIGA *****/
		
		int val = congetturaCollaz(100);
		System.out.println(val);
		
		
		
		
	}
}
