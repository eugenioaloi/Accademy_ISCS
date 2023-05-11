package manipolazioneJavaIo;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFromScanner {
	
	public void readFile() throws Exception {
		FileWriter fw=null;
		
		String row = "";
		
		Scanner sc = new Scanner(new File("negozio.txt"));
		Scanner scRow = null;
		String string = "";
		
		double prezzoUnitario = 0.0;
		int qt = 0;
		String desc = "";
		
		while (sc.hasNextLine()) {
			
			row = sc.nextLine();//estraggo la riga del file
			
			if(row.isBlank()) {
				continue;
			}
			
			scRow = new Scanner(row);
			
			prezzoUnitario = scRow.nextDouble();
			qt = scRow.nextInt();
			desc = scRow.next();
			
			String s = prezzoUnitario+" " + qt+ " " + desc;
			System.out.println(s);
			
			fw = new FileWriter("stampaNegozio.txt");
			fw.write(s);
			
		}
		
		sc.close();
		scRow.close();
		
	}
	

}
