package leggiDaInternet;

import java.net.URL;
import java.util.Scanner;

public class LeggiDaInternet {
	public static void main(String[] args) {
		
		URL url = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il cocktail che vuoi");
		String drink =scanner.nextLine();
		
		try {
			//url = new URL("https://testecdl.altervista.org/stati.txt");
			//url = new URL("https://jsonplaceholder.typicode.com/users");
			url = new URL("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + drink);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		
	}
}
