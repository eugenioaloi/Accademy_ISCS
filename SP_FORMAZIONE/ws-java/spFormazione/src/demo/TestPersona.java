package demo;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestPersona {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    Calendar cal = Calendar.getInstance();
	    cal.clear();

	    System.out.println("Inserisci l'anno");
	    cal.set(Calendar.YEAR, sc.nextInt());
	    sc.nextLine();
	    
	    System.out.println("Inserisci il mese");
	    cal.set(Calendar.MONTH, sc.nextInt()+1);
	    sc.nextLine();
	    
	    System.out.println("Inserisci il giorno");
	    cal.set(Calendar.DATE, sc.nextInt());
	    sc.nextLine();

		Date data = cal.getTime();
		
		Persona p = new Persona("Pippo", "Snappi",data);
		
		System.out.println(p);
		
		sc.close();
		
	}
}
