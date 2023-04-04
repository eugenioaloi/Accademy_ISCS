package data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
	public static void main(String[] args) {
			
			Date today = new Date();
			System.out.println("today is; " + today);
			
			int day = today.getDate();
			int month = today.getMonth()+1;//parte da 0
			int year = today.getYear()+1900;//ritorna la data meno 1900
			
			System.out.println(day+"/"+month+"/"+year);
			
			//*************************************************
			
			Calendar calend = Calendar.getInstance();
			System.out.println("la data di oggi è: " + calend.getTime());
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\n"
														//+ "EEEE dd MMMM y\n"
														//+ "'giorno dell'anno' D\n"
														//+ "'giorno della settimana' w\n"
					);
			
			//chiama il fomato e poi lo applica all'oggetto di tipo calendar chiamando il
			//metodo getTime()
			System.out.println(df.format(calend.getTime()));
			
			System.out.println("day: " + calend.get(Calendar.DATE));//num giorno corrente
			System.out.println("day of week: "+ calend.get(Calendar.DAY_OF_WEEK));//num giorno settimana
			System.out.println("month: " + (calend.get(Calendar.MONTH)+1));//mese parte da 0 genn=0
			System.out.println("year: " + calend.get(Calendar.YEAR));//anno
			
			//************************************************************

			Calendar cal = Calendar.getInstance();
			
			System.out.println("today date: " + cal.getTime());

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

