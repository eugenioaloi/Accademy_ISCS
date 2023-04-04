package gestioneEcceszione;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestioneEccezione {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=10;
		int b=0;
		
		//gestione dell'errore
		try {
			int c = a/b;
		} catch (Exception e) {//ArithmeticException
			System.out.println("Non è possibile dividere per zero");
			e.printStackTrace();//stampa la traccia dell'errore
		}
		
		//si può gestire con più try/catch, dal più specifico al generale
		try {
			int c = a/b;
		} catch (ArithmeticException | NullPointerException e) {//
			System.out.println("Non è possibile dividere per zero");
		}catch (Exception e) {
			System.out.println("Gestisco l'errore che non riesco a capire qual'è");
		}

		//try-catch-finally -> il codice nel blocco finally viene eseguito sempre
		try {
			int c = a/b;
		} catch (Exception e) {
			System.out.println("Non so che errore devo gestire");
		}finally {
			System.out.println("vengo eseguito anche se non ci sono errori");
		}
		
		int [] numeri = {1,2,3};
		
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(numeri[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sei fuori dall'array -> "+ e.getMessage());
		}
		
		//************************************ Controllare l'input in un oggetto di tipo scanner
		
		
		try {
			System.out.println("Inserisci un numero");
			int num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Mi dispiace non hai inserito un numero");
		}finally {//si mettono tutte le operazioni che comunque si devono fare indipendemente dal flusso del ciclo
			sc.close();
		}
		
		//************************************** Lanciare un'eccezione custom
		
		try {
			System.out.println("ciao a tutti");
			throw new Exception("Sono un'eccezione a caso");
		} catch (Exception e) {
			System.out.println("Ho lanciato l'eccezione che hai creato");
		}

		//************************************** Lanciare un'eccezione personale a runtime - eccezioni irreparabili (UNCHECKED)
		//L'eventuale errore avviene a runtime
		//--> classe java.lang.runTimeException
		
		System.out.println("Inserisci un numero");
		int num = sc.nextInt();
		
		try {
			if(num<0) {
				throw new RuntimeException();
			}
			System.out.println("La radice quadrata di "+ num + " è: " + Math.sqrt(num));
		} catch (Exception e) {
			System.out.println("Il numero non può essere negativo");
		}finally {
			sc.close();
		}
		
		//************************** PROPRAGAZIONE DELLE ECCEZIONI
		
		try {
			System.out.println("blocco try Esterno");
			try {
				System.out.println("Blocco try interno");
				throw new Exception("Eccezione sollevata dal blocco interno");
			} catch (ArithmeticException e) {
				System.out.println("Gestisco l'eccezione del blocco interno");
			}finally {
				System.out.println("Blocco finally interno");
			}
		} catch (Exception e) {
			System.out.println("blocco catch Esterno");
		}finally {
			System.out.println("blocco finally Esterno");
		}
		
		//************************** Metodo che prevede il lancio di un'eccezione - eccezioni reparabili (CHECKED)
		//Si obbliga a fare un try/catch
		//--> classe java.lang.exception

		try {
			leggiNumero("z123");//Questo metodo lancia un'eccezione, per questo deve essere coperto da un try/catch
		} catch (Exception e) {
			System.out.println("Erore nella conversione");
		}
		
		
	}//fine main
	
	static void leggiNumero(String s) throws Exception{
		System.out.println("Provo a convertire la Stringa in numero");
		int num = Integer.parseInt(s);
		System.out.println("num: " + num);
	}
	
	
}//fine classe
