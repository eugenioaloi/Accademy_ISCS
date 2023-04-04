package leggiDaScanner;

import java.io.File;
import java.util.Scanner;

public class LeggiDaScanner {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\aloie\\workspace_Corso_Java\\LetturaFile\\Esempio.txt");
		
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
