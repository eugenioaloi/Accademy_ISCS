package manipolazioneJavaIo;

import java.io.File;
import java.util.Scanner;

public class ReadFromScanner {
	
	public void readFile() throws Exception {
		File filePath = new File("negozio.txt");
		String row;
		
		Scanner sc = new Scanner(filePath);
		Scanner scRow = null;
		
		double prezzo = 0.00;
		int qt = 0;
		String desc = "";

		while(sc.hasNextLine()) {
			
			row = sc.nextLine();
			
			if(row.isBlank()) {
				continue;
			}
			
			scRow = new Scanner(row);
			
			prezzo = sc.nextDouble();
			
			if(!scRow.hasNextInt()) {
				System.out.println("ci dovrebbe essere un intero in questa posizione");
			}
			
			qt = sc.nextInt();
			
			if(!scRow.hasNext()) {
				System.out.println("ci dovrebbe essere una Stringa in questa posizione");
			}
			
			desc = sc.next();
			
			System.out.println(prezzo+" " + qt + " " + desc);
			
		}
		
		sc.close();
		scRow.close();
		
	}
	

}
