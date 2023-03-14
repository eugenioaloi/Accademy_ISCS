package date_example;

import java.util.Calendar;

public class Exercise1 {
	public static void main(String[] args) {
		//stampare la data di oggi 
		//e a partire dalla frase "java è un bel linguaggio di programmazione"
		//pos parola linguaggio e programmazione
		//isolare a partire dalla pos trovate la stringa linguaggio di programmazione
		//trovare la pos della seconda g e l'ultimo carattere della frase
		
		Calendar calend = Calendar.getInstance();
		
		System.out.println("today date: " + calend.getTime());

		String myStr = "java è un bel linguaggio di programmazione";
		
		int pos1 = myStr.indexOf("linguaggio");
		int pos2 = myStr.indexOf("programmazione");
		
		System.out.println("pos 1: " + pos1 + " pos 2: " + pos2);
		
		String sub = myStr.substring(14,myStr.length());
		
		System.out.println("sub string: " + sub);
		
		int secondG = myStr.indexOf("gg");
		System.out.println("second g: " + secondG);
		
		char lastChar = myStr.charAt(myStr.length()-1);
		System.out.println("last char: " + lastChar);
		
		
	}

}
